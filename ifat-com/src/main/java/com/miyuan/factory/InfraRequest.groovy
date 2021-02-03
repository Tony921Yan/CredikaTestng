package com.miyuan.factory

import com.miyuan.com.TestContext
import com.miyuan.com.TestEnv
//import com.miyuan.perf.util.AESOperator
//import com.miyuan.perf.util.MD5Utils
import com.miyuan.util.HttpUtil
import com.miyuan.util.JsonUtil
import com.miyuan.util.ResourceUtil
import org.apache.commons.lang3.ObjectUtils

import java.lang.reflect.Method

abstract class InfraRequest {
    public String api
    public List params
    public String preInvoke

    InfraRequest invoke(TestContext testContext){
        String url  = ResourceUtil.getBeanData("miyuan-url").get("infra")+api
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
                if(JsonUtil.isJSON(testContext.get(str).toString())){
                    req.put(str, JsonUtil.strToJson(testContext.get(str).toString()))
                }else {
                    req.put(str, testContext.get(str))
                }
            }
        }
        println(req)
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

    InfraRequest preInvoke(TestContext testContext){
        if(preInvoke!=null){
            Class clazz = Class.forName(preInvoke)
            Method method1 = clazz.getMethod("invoke", TestContext.class)
            method1.invoke(clazz.newInstance(),testContext)
            Method method2 = clazz.getMethod("afterInvoke", TestContext.class)
            method2.invoke(clazz.newInstance(),testContext)
        }
        return this
    }

    InfraRequest afterInvoke(TestContext testContext){

    }

    InfraRequest baseAssert(TestContext testContext){
        assert testContext.getResponse().code == "0"
        return this
    }

    InfraRequest specialAssert(TestContext testContext){

    }
}
