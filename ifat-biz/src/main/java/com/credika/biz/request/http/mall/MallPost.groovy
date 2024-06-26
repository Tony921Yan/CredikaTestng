package com.credika.biz.request.http.mall


import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestEnv
import com.miyuan.ifat.support.util.HttpUtil
import com.miyuan.ifat.support.util.JsonUtil
import com.miyuan.ifat.support.util.ResourceUtil
import com.miyuan.ifat.support.util.TokenUtil
import com.miyuan.ifat.support.vo.Record
import com.miyuan.ifat.support.vo.Result
import org.apache.commons.lang3.ObjectUtils

import java.lang.reflect.Method

abstract class MallPost {
    public String api
    public List params
    public String preInvoke

    MallPost invoke(TestContext testContext){
        String mallUrl = ResourceUtil.getBeanData("http").get("mall")
        String url  = mallUrl+api
        Map heads = new HashMap()
        heads.put("timestamp",System.currentTimeMillis())
        heads.put("nonce",testContext.get("nonce"))
        heads.put("Content-Type",testContext.get("Content-Type"))
        Long userId = Long.valueOf(testContext.get("userId").toString())
        println(userId)
        String token = TokenUtil.generateToken(userId)
        println(token)
//        Long dealerId = Long.valueOf(testContext.get("dealerId").toString())
//        heads.put("userType",testContext.get("userType"))
//        heads.put("dealerId",testContext.get("dealerId"))
//        heads.put("userId",testContext.get("userId"))
        heads.put("token", token)
        //heads.put("cookie", CookieService.getMallCookie(mallUrl,userId,dealerId))
        heads.put("token", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJsb2dpblR5cGUiOiJ1c2VyIiwibG9naW5JZCI6MTAsInJuU3RyIjoiRzA0cExLMUlLQUNWZjJOcnlZdEVyRXVSWTVSUzg3MU8iLCJyb2xlIjoiY191c2VyIiwiYWNjb3VudFR5cGUiOjB9.yhWIhMtu26JBmbI4Gb0jp603W2yjCtbRKHSHIBV4X8g")
        heads.put("apiReleaseTag","prod")  //不同环境要切不同的tag

        if(TestEnv.isGray()=="true"){
            heads.put("grayReleaseTag","gray")
        }
//        String uuid = UUID.randomUUID().toString()
//        heads.put("userLogTracingTag",uuid)
//        heads.put("isUserLogTracing",true)
        Map req = new HashMap()
        for(String str:params){
            if(ObjectUtils.isNotEmpty(testContext.get(str))){
                req.put(str,JsonUtil.objectParse(testContext.get(str)))
            }
        }
        testContext.appendLog(new Record("接口地址",url))
        testContext.appendLog(new Record("请求头",heads))
        testContext.appendLog(new Record("请求参数",req))
        def result = HttpUtil.post(url,heads, req)
        testContext.setResult(result)
        testContext.appendLog(new Record("返回结果",result.getResp()))
        return this
    }

    MallPost preInvoke(TestContext testContext){
        if(preInvoke!=null){
            try {
                Class clazz = Class.forName(preInvoke)
                Method method1 = clazz.getMethod("invoke", TestContext.class)
                method1.invoke(clazz.newInstance(),testContext)
                Method method2 = clazz.getMethod("baseAssert", TestContext.class)
                method2.invoke(clazz.newInstance(),testContext)
                Method method3 = clazz.getMethod("afterInvoke", TestContext.class)
                method3.invoke(clazz.newInstance(),testContext)
            }catch (Exception e){
                throw e.cause
            }
        }
        return this

    }

    MallPost afterInvoke(TestContext testContext){
        return this
    }

    MallPost baseAssert(TestContext testContext){
        Result result = testContext.getResult() as Result
        assert result.getHttpStatusCode() == 200
        assert testContext.getResponse().code == "0"
        return this
    }

    MallPost specialAssert(TestContext testContext){
        return this
    }

}
