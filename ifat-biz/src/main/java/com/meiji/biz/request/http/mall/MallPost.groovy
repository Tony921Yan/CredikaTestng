package com.meiji.biz.request.http.mall

import com.meiji.biz.service.CookieService
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestEnv
import com.miyuan.ifat.support.util.HttpUtil
import com.miyuan.ifat.support.util.JsonUtil
import com.miyuan.ifat.support.util.ResourceUtil
import com.miyuan.ifat.support.vo.Record
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
        heads.put("timestamp",testContext.get("timestamp"))
        heads.put("nonce",testContext.get("nonce"))
        heads.put("Content-Type",testContext.get("Content-Type"))
        Long userId = Long.valueOf(testContext.get("userId").toString())
        Long dealerId = Long.valueOf(testContext.get("dealerId").toString())
        heads.put("userType",testContext.get("userType"))
        heads.put("dealerId",testContext.get("dealerId"))
        heads.put("userId",testContext.get("userId"))
        heads.put("cookie", CookieService.getMallCookie(mallUrl,userId,dealerId))

        if(TestEnv.isGray()=="true"){
            heads.put("isGrayRelease",true)
        }
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

    }

    MallPost baseAssert(TestContext testContext){
        assert testContext.getResponse().code == 0
        return this
    }

    MallPost specialAssert(TestContext testContext){
    }

}
