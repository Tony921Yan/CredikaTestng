package com.meiji.request.api

import com.meiji.com.TestContext
import com.meiji.service.DubboService
import com.meiji.util.JsonUtil
import com.meiji.util.ResourceUtil
import org.apache.commons.lang3.ObjectUtils

import java.lang.reflect.Method

abstract class  BaseRequest {
    public String interfaceName
    public String methodName
    public String version
    public Integer timeOut
    public List paramsType
    public List params
    public String preInvoke

    BaseRequest invoke(TestContext testContext){
        String zk  = ResourceUtil.getBeanData("miyuan-url").get("infra")
        List req = new ArrayList()
        for(int i=0;i<params.size();i++){
            if(!paramsType.get(i).toString().startsWith("java.")) {
                List list = params.get(i) as List
                Map reqParam = new HashMap()
                for (String str : list) {
                    if (ObjectUtils.isNotEmpty(testContext.get(str))) {
                        reqParam.put(str, testContext.get(str).toString())
                    }
                }
                reqParam.put("class",paramsType.get(i))
                req.add(reqParam)
            }else {
                List list = params.get(i) as List
                if (ObjectUtils.isNotEmpty(testContext.get(list.get(0)))) {
                    req.add(testContext.get(list.get(0)).toString())
                }
            }
        }
        println("interface:"+interfaceName)
        println("methodName:"+methodName)
        println("param:"+ req)
        Object result = DubboService.invoke(interfaceName,methodName,version,timeOut,paramsType as String[],req as Object[])
        testContext.put("response",result)
        println("response:"+JsonUtil.prettyJson(result.toString()))
        //testContext.appendLog("url:"+url)
        //testContext.appendLog("heads:"+heads)
        //testContext.appendLog("params:"+req)
        //testContext.appendLog("response:"+JsonUtil.prettyJson(res))
        //testContext.put("response",res)
        //testContext.put("allure_url", url)
        //testContext.put("allure_headers", heads)
        //testContext.put("allure_params", req)
        //testContext.put("allure_response", JsonUtil.prettyJson(res))
        return this
    }

    BaseRequest preInvoke(TestContext testContext){
        if(preInvoke!=null){
            Class clazz = Class.forName(preInvoke)
            Method method1 = clazz.getMethod("invoke", TestContext.class)
            method1.invoke(clazz.newInstance(),testContext)
            Method method2 = clazz.getMethod("afterInvoke", TestContext.class)
            method2.invoke(clazz.newInstance(),testContext)
        }
        return this
    }

    BaseRequest afterInvoke(TestContext testContext){

    }

    BaseRequest baseAssert(TestContext testContext){
        assert testContext.getResponse().code == "0"
        return this
    }

    BaseRequest specialAssert(TestContext testContext){

    }
}
