package com.meiji.biz.request.http.testInterface.cps


import com.meiji.biz.util.CpsSign
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestEnv
import com.miyuan.ifat.support.util.HttpUtil
import com.miyuan.ifat.support.util.JsonUtil
import com.miyuan.ifat.support.util.ResourceUtil
import com.miyuan.ifat.support.vo.Record
import org.apache.commons.lang3.ObjectUtils

import java.lang.reflect.Method

abstract class CpsPost {
    public String api
    public List params
    public String preInvoke
    private static String appKey = ResourceUtil.getBeanData("cps").get("appKey")
    private static String secret = ResourceUtil.getBeanData("cps").get("secret")

    CpsPost invoke(TestContext testContext){
        String shopUrl = ResourceUtil.getBeanData("http").get("thirdparty")
        String url  = shopUrl+api
        Map heads = new HashMap()
        String timestamp = System.currentTimeMillis()
        heads.put("Content-Type",testContext.get("Content-Type"))
        heads.put("timestamp",timestamp)
        heads.put("appKey",appKey)
        if(TestEnv.isGray()=="true"){
            heads.put("isGrayRelease",true)
        }
        TreeMap req = new TreeMap()
        for(String str:params){
            if(ObjectUtils.isNotEmpty(testContext.get(str))){
                req.put(str,JsonUtil.objectParse(testContext.get(str)))
            }
        }
        String sign = CpsSign.sign(secret,heads,req)
        heads.put("sign",sign)
        testContext.appendLog(new Record("接口地址",url))
        testContext.appendLog(new Record("请求头",heads))
        testContext.appendLog(new Record("请求参数",req))
        String res = HttpUtil.post(url,heads, req)
        testContext.setResponse(res)
        testContext.appendLog(new Record("返回结果",res))
        return this
    }

    CpsPost preInvoke(TestContext testContext){
        if(preInvoke!=null){
            Class clazz = Class.forName(preInvoke)
            Method method1 = clazz.getMethod("invoke", TestContext.class)
            method1.invoke(clazz.newInstance(),testContext)
            Method method2 = clazz.getMethod("afterInvoke", TestContext.class)
            method2.invoke(clazz.newInstance(),testContext)
        }
        return this
    }

    CpsPost afterInvoke(TestContext testContext){

    }

    CpsPost baseAssert(TestContext testContext){
        assert testContext.getResponse().code == "0"
        return this
    }

    CpsPost specialAssert(TestContext testContext){
    }

}
