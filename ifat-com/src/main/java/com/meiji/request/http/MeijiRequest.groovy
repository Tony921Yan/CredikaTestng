package com.meiji.request.http

import com.meiji.com.TestContext
import com.meiji.util.HttpUtil
import com.meiji.util.JsonUtil
import com.meiji.util.ResourceUtil
import org.apache.commons.lang3.ObjectUtils

import java.lang.reflect.Method

abstract class MeijiRequest {
    public String api
    public List params
    public String preInvoke

    MeijiRequest invoke(TestContext testContext){
        String url  = ResourceUtil.getBeanData("http").get("url")+api
        Map heads = new HashMap()
        heads.put("timestamp",testContext.get("timestamp"))
        heads.put("nonce",testContext.get("nonce"))
        heads.put("Content-Type",testContext.get("Content-Type"))
        heads.put("userId",11)
//        String aesKey = MD5Utils.MD5Encode("11", "utf-8")
//        String tokenAes = AESOperator.encrypt(testContext.get("token").toString(), aesKey)
//        heads.put("token",tokenAes)

//        if(TestEnv.getIsGray()=="true"){
//            heads.put("isGrayRelease",true)
//        }
        Map req = new HashMap()
        for(String str:params){
            if(ObjectUtils.isNotEmpty(testContext.get(str))){
                req.put(str,JsonUtil.objectParse(testContext.get(str)))
            }
        }
        String res = HttpUtil.post(url,heads, req)
        testContext.appendLog("url:"+url)
        testContext.appendLog("heads:")
        testContext.appendLog(heads)
        testContext.appendLog("params:")
        testContext.appendLog(req)
        testContext.appendLog("response:")
        testContext.appendLog(res)
        testContext.put("response",res)
        testContext.put("allure_url", url)
        testContext.put("allure_headers", heads)
        testContext.put("allure_params", req)
        testContext.put("allure_response", res)
        return this
    }

    MeijiRequest preInvoke(TestContext testContext){
        if(preInvoke!=null){
            Class clazz = Class.forName(preInvoke)
            Method method1 = clazz.getMethod("invoke", TestContext.class)
            method1.invoke(clazz.newInstance(),testContext)
            Method method2 = clazz.getMethod("afterInvoke", TestContext.class)
            method2.invoke(clazz.newInstance(),testContext)
        }
        return this
    }

    MeijiRequest afterInvoke(TestContext testContext){

    }

    MeijiRequest baseAssert(TestContext testContext){
        assert testContext.getResponse().code == "0"
        return this
    }

    MeijiRequest specialAssert(TestContext testContext){
    }

}
