package com.meiji.biz.request.http.testInterface.cps


import com.meiji.biz.util.CpsSign
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.util.HttpUtil
import com.miyuan.ifat.support.util.JsonUtil
import com.miyuan.ifat.support.util.ResourceUtil
import com.miyuan.ifat.support.vo.Record
import org.apache.commons.lang3.ObjectUtils

import java.lang.reflect.Method

abstract class CpsPost200 {
    public String api
    public List params
    public String preInvoke
    private String appKey = "cps_mykey666"

    CpsPost200 invoke(TestContext testContext){
        String shopUrl = ResourceUtil.getBeanData("http").get("thirdparty")
        String url  = shopUrl+api
        Map heads = new HashMap()
        String timestamp = System.currentTimeMillis()
        heads.put("Content-Type",testContext.get("Content-Type"))
        heads.put("timestamp",timestamp)
        heads.put("appKey","cps_mykey666")
        Long dealerId = Long.valueOf(testContext.get("dealerId").toString())
        //heads.put("cookie",CookieService.getShopCookie(shopUrl,dealerId))
        TreeMap req = new TreeMap()
        for(String str:params){
            if(ObjectUtils.isNotEmpty(testContext.get(str))){
                req.put(str,JsonUtil.objectParse(testContext.get(str)))
            }
        }
        req.put("timestamp",timestamp)
        req.put("appKey","cps_mykey666")
        String sign = CpsSign.sign(req)
        heads.put("sign",sign)
        req.remove("timestamp")
        req.remove("appKey")
        testContext.appendLog(new Record("接口地址",url))
        testContext.appendLog(new Record("请求头",heads))
        testContext.appendLog(new Record("请求参数",req))
        String res = HttpUtil.post(url,heads, req)
        testContext.setResponse(res)
        testContext.appendLog(new Record("返回结果",res))
        return this
    }

    CpsPost200 preInvoke(TestContext testContext){
        if(preInvoke!=null){
            Class clazz = Class.forName(preInvoke)
            Method method1 = clazz.getMethod("invoke", TestContext.class)
            method1.invoke(clazz.newInstance(),testContext)
            Method method2 = clazz.getMethod("afterInvoke", TestContext.class)
            method2.invoke(clazz.newInstance(),testContext)
        }
        return this
    }

    CpsPost200 afterInvoke(TestContext testContext){

    }

    CpsPost200 baseAssert(TestContext testContext){
        assert testContext.getResponse().code == "200"
        return this
    }

    CpsPost200 specialAssert(TestContext testContext){
    }

}