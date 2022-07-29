package com.meiji.biz.request.http.shop

import com.meiji.biz.service.CookieService
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestEnv
import com.miyuan.ifat.support.util.HttpUtil
import com.miyuan.ifat.support.util.JsonUtil
import com.miyuan.ifat.support.util.ResourceUtil
import com.miyuan.ifat.support.vo.Record
import com.miyuan.ifat.support.vo.Result
import org.apache.commons.lang3.ObjectUtils

import java.lang.reflect.Method

abstract class ShopPost {
    public String api
    public List params
    public String preInvoke

    ShopPost invoke(TestContext testContext) {
        String shopUrl = ResourceUtil.getBeanData("http").get("shop")
        String url = shopUrl + api
        Map heads = new HashMap()
        heads.put("timestamp",System.currentTimeMillis())
        heads.put("nonce", testContext.get("nonce"))
        heads.put("Content-Type", testContext.get("Content-Type"))
        Long dealerId = Long.valueOf(testContext.get("dealerId").toString())
        heads.put("cookie", CookieService.getShopCookie(shopUrl, dealerId))
        String uuid = UUID.randomUUID().toString()
        heads.put("userLogTracingTag",uuid)
        if(TestEnv.isGray()=="true"){
            heads.put("isGrayRelease",true)
        }
        Map req = new HashMap()
        for (String str : params) {
            if (ObjectUtils.isNotEmpty(testContext.get(str))) {
                req.put(str, JsonUtil.objectParse(testContext.get(str)))
            }
        }
        testContext.appendLog(new Record("接口地址", url))
        testContext.appendLog(new Record("请求头", heads))
        testContext.appendLog(new Record("请求参数", req))
        def result = HttpUtil.post(url, heads, req)
        testContext.setResult(result)
        testContext.appendLog(new Record("返回结果", result.getResp()))
        return this
    }

    ShopPost preInvoke(TestContext testContext){
        if(preInvoke!=null){
            Class clazz = Class.forName(preInvoke)
            Method method1 = clazz.getMethod("invoke", TestContext.class)
            method1.invoke(clazz.newInstance(),testContext)
            Method method2 = clazz.getMethod("afterInvoke", TestContext.class)
            method2.invoke(clazz.newInstance(),testContext)
        }
        return this
    }

    ShopPost afterInvoke(TestContext testContext){

    }

    ShopPost baseAssert(TestContext testContext){
        Result result = testContext.getResult() as Result
        assert result.getHttpStatusCode() == 200
        assert testContext.getResponse().code == 0
        return this
    }

    ShopPost specialAssert(TestContext testContext){
    }

}
