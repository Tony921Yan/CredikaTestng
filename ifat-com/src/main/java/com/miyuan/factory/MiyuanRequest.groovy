package com.miyuan.factory

import com.miyuan.com.TestContext
import com.miyuan.com.TestEnv
import com.miyuan.service.OrderService
import com.miyuan.util.DateUtil
import com.miyuan.util.HttpUtil
import com.miyuan.util.JsonUtil
import com.miyuan.util.MoneyUtil
import com.miyuan.util.ResourceUtil
import org.apache.commons.lang3.ObjectUtils
import org.testng.Reporter
import com.miyuan.perf.util.*
import java.lang.reflect.Method
import java.util.stream.Collectors

abstract class MiyuanRequest {
    public String api
    public List params
    public String preInvoke

    MiyuanRequest invoke(TestContext testContext){
        String url  = ResourceUtil.getBeanData("miyuan-url").get("api")+api
        Map heads = new HashMap()
        heads.put("timestamp",testContext.get("timestamp"))
        heads.put("nonce",testContext.get("nonce"))
        heads.put("Content-Type",testContext.get("Content-Type"))
        String aesKey = MD5Utils.MD5Encode("11", "utf-8")
        String tokenAes = AESOperator.encrypt(testContext.get("token").toString(), aesKey)
        heads.put("token",tokenAes)

        if(TestEnv.getIsGray()=="true"){
            heads.put("isGrayRelease",true)
        }
        Map req = new HashMap()
        for(String str:params){
            if(ObjectUtils.isNotEmpty(testContext.get(str))){
                req.put(str,testContext.get(str).toString())
            }
        }
        String res = HttpUtil.post(url,heads, req)
        testContext.appendLog("url:"+url)
        testContext.appendLog("heads:"+heads)
        testContext.appendLog("params:"+req)
        testContext.appendLog("response:"+JsonUtil.prettyJson(res))
        testContext.put("response",res)
        testContext.put("allure_url", url)
        testContext.put("allure_headers", heads)
        testContext.put("allure_params", req)
        testContext.put("allure_response", JsonUtil.prettyJson(res))
        return this
    }

    MiyuanRequest preInvoke(TestContext testContext){
        if(preInvoke!=null){
            Class clazz = Class.forName(preInvoke)
            Method method1 = clazz.getMethod("invoke", TestContext.class)
            method1.invoke(clazz.newInstance(),testContext)
            Method method2 = clazz.getMethod("afterInvoke", TestContext.class)
            method2.invoke(clazz.newInstance(),testContext)
        }
        return this
    }

    MiyuanRequest afterInvoke(TestContext testContext){

    }

    MiyuanRequest baseAssert(TestContext testContext){
        assert testContext.getResponse().code == "B00000"
        return this
    }

    MiyuanRequest specialAssert(TestContext testContext){

    }
}
