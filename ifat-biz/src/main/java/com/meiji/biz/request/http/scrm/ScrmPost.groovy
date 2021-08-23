package com.meiji.biz.request.http.scrm

import com.meiji.biz.service.CookieService
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.util.HttpUtil
import com.miyuan.ifat.support.util.JsonUtil
import com.miyuan.ifat.support.util.ResourceUtil
import com.miyuan.ifat.support.vo.Record
import org.apache.commons.lang3.ObjectUtils

import java.lang.reflect.Method

abstract class ScrmPost {
    public String api
    public List params
    public String preInvoke

    ScrmPost invoke(TestContext testContext){
        String scrmUrl = ResourceUtil.getBeanData("http").get("scrm")
        String url = scrmUrl + api
        Map heads = new HashMap()
//        heads.put("timestamp",testContext.get("timestamp"))
//        heads.put("nonce",testContext.get("nonce"))
        heads.put("Content-Type",testContext.get("Content-Type"))
//        Long userId = Long.valueOf(testContext.get("userId").toString())
//        heads.put("cookie", CookieService.getMallCookie(scrmUrl,userId))
//        heads.put("token","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJhdWQiOiJBUFAiLCJjb3JwSWQiOiIxODUiLCJpc3MiOiJTZXJ2aWNlIiwiZXhwIjoxNjI5MDgyMzUxLCJ1c2VySWQiOiIxOTEiLCJpYXQiOjE2MjgyMTgzNTF9.pWiv-5R-OENfHROCSAfC0iKWdFTr9YexNcPGt-gfafs")
        heads.put("token","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJhdWQiOiJBUFAiLCJjb3JwSWQiOiIxODUiLCJpc3MiOiJTZXJ2aWNlIiwiZXhwIjoxNjYwOTA3NDE3LCJ1c2VySWQiOiIxOTEiLCJpYXQiOjE2MjkzNzE0MTd9.15oHZ5biDkXCL00k_DaH7o3o-oxUvh3WGDyCngmz_xc")
//        if(TestEnv.getIsGray()=="true"){
//            heads.put("isGrayRelease",true)
//        }
        Map req = new HashMap()
        for(String str:params){
            if(ObjectUtils.isNotEmpty(testContext.get(str))){
                req.put(str,JsonUtil.objectParse(testContext.get(str)))
            }
        }
        testContext.appendLog(new Record("接口地址",url))
        testContext.appendLog(new Record("请求头",heads))
        testContext.appendLog(new Record("请求参数",req))
        String res = HttpUtil.post(url,heads, req)
        testContext.setResponse(res)
        testContext.appendLog(new Record("返回结果",res))
        return this
    }

    ScrmPost preInvoke(TestContext testContext){
        if(preInvoke!=null){
            Class clazz = Class.forName(preInvoke)
            Method method1 = clazz.getMethod("invoke", TestContext.class)
            method1.invoke(clazz.newInstance(),testContext)
            Method method2 = clazz.getMethod("afterInvoke", TestContext.class)
            method2.invoke(clazz.newInstance(),testContext)
        }
        return this
    }

    ScrmPost afterInvoke(TestContext testContext){

    }

    ScrmPost baseAssert(TestContext testContext){
        assert testContext.getResponse().code == "0"
        return this
    }

    ScrmPost specialAssert(TestContext testContext){
    }

}
