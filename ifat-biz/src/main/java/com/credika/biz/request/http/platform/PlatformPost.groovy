package com.credika.biz.request.http.platform
import com.credika.biz.service.CookieService
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestEnv
import com.miyuan.ifat.support.util.HttpUtil
import com.miyuan.ifat.support.util.JsonUtil
import com.miyuan.ifat.support.util.ResourceUtil
import com.miyuan.ifat.support.vo.Record
import com.miyuan.ifat.support.vo.Result

import java.lang.reflect.Method

abstract class PlatformPost {
    public  String api
    public  List params
    public  String preInvoke

    PlatformPost invoke(TestContext testContext){
        String url  = ResourceUtil.getBeanData("http").get("platform1")
        String username = testContext.get("username")
        String password = testContext.get("password")
        System.out.println(url)
        System.out.println(username)
        System.out.println(password)
        String cookie = CookieService.getPlatformCookie(url,username,password)
        //String cookie = "eyJhbGciOiJIUzI1NiJ9.eyJsb2dpbl91c2VyX2tleSI6IjZhZjMyMTljLTQ1MDktNDNiYi04YzBmLTU1YzY2OGI3YjY2OCJ9.8LpIIoOE9lauj7datiCkIKFzFFImwwE7YLzrjzEJcvI"
        url = url +api
        Map heads = new HashMap()
        heads.put("timestamp",System.currentTimeMillis())
        heads.put("nonce",testContext.get("nonce"))
        heads.put("Content-Type",testContext.get("Content-Type"))
        heads.put("Authorization", cookie)
        String uuid = UUID.randomUUID().toString()
        heads.put("userLogTracingTag",uuid)
        heads.put("isUserLogTracing",true)
        if(TestEnv.isGray()=="true"){
            heads.put("isGrayRelease",true)
        }
        Map req = new HashMap()
        for(String str:params){
//            if(ObjectUtils.isNotEmpty(testContext.get(str))){
                req.put(str, JsonUtil.objectParse(testContext.get(str)))
//            }
        }
        testContext.appendLog(new Record("接口地址",url))
        testContext.appendLog(new Record("请求头",heads))
        testContext.appendLog(new Record("请求参数",req))
        def result = HttpUtil.post(url,heads, req)
        testContext.setResult(result)
        testContext.setRequest(req)
        testContext.appendLog(new Record("返回结果",result.getResp()))
//
//        HttpResponse httpResponse = HttpUtil.postV2(url,heads,req)
//        System.out.println("httpResponse 返回数据：" +  httpResponse)
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
        return this
    }

    PlatformPost baseAssert(TestContext testContext){
        Result result = testContext.getResult() as Result
        assert result.getHttpStatusCode() == 200
        assert testContext.getResponse().code == 200
        return this
    }

    PlatformPost specialAssert(TestContext testContext) {
        return this
    }
}
