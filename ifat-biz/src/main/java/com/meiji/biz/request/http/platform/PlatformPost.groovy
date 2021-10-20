package com.meiji.biz.request.http.platform

import com.meiji.biz.service.CookieService
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.util.HttpUtil
import com.miyuan.ifat.support.util.JsonUtil
import com.miyuan.ifat.support.util.ResourceUtil
import com.miyuan.ifat.support.vo.Record

import java.lang.reflect.Method

abstract class PlatformPost {
    public String api
    public List params
    public String preInvoke

    PlatformPost invoke(TestContext testContext){
        String url  = ResourceUtil.getBeanData("http").get("platform")
        String username = testContext.get("username")
        String password = testContext.get("password")
        String cookie = CookieService.getPlatformCookie(url,username,password)
        url = url +api
        Map heads = new HashMap()
        heads.put("timestamp",testContext.get("timestamp"))
        heads.put("nonce",testContext.get("nonce"))
        heads.put("Content-Type",testContext.get("Content-Type"))
        heads.put("Cookie", cookie)

        Map req = new HashMap()
        for(String str:params){
            //if(ObjectUtils.isNotEmpty(testContext.get(str))){
                req.put(str,JsonUtil.objectParse(testContext.get(str)))
           // }
        }
        testContext.appendLog(new Record("接口地址",url))
        testContext.appendLog(new Record("请求头",heads))
        testContext.appendLog(new Record("请求参数",req))
        String res = HttpUtil.post(url,heads, req)
        testContext.setResponse(res)
        testContext.appendLog(new Record("返回结果",res))
        return this
    }

    PlatformPost preInvoke(TestContext testContext){
        if(preInvoke!=null){
            Class clazz = Class.forName(preInvoke)
            Method method1 = clazz.getMethod("invoke", TestContext.class)
            method1.invoke(clazz.newInstance(),testContext)
            Method method2 = clazz.getMethod("afterInvoke", TestContext.class)
            method2.invoke(clazz.newInstance(),testContext)
        }
        return this
    }

    PlatformPost afterInvoke(TestContext testContext){

    }

    PlatformPost baseAssert(TestContext testContext){
        assert testContext.getResponse().code == 0
        return this
    }

    PlatformPost specialAssert(TestContext testContext){
    }

}
