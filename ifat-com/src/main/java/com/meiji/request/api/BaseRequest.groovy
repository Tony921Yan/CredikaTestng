package com.meiji.request.api

import com.meiji.com.TestContext
import com.meiji.service.DubboService
import com.meiji.util.JsonUtil
import com.meiji.util.ResourceUtil
import com.meiji.vo.ResultRpcVO
import groovy.json.JsonSlurper
import org.apache.commons.lang3.ObjectUtils

import java.lang.reflect.Method

abstract class  BaseRequest {
    public String interfaceName
    public String methodName
    public String version
    public String group
    public Integer timeOut
    public List paramsType
    public List params
    public String preInvoke

    BaseRequest invoke(TestContext testContext){
        String address  = ResourceUtil.getBeanData("dubbo").get("url")
        List req = new ArrayList()
        Map reqMapForLog = new HashMap()
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
                reqMapForLog.put(paramsType.get(i),reqParam)
            }else {
                String str
                if(params.get(i).class.isInstance(new ArrayList()) ){
                    List list = params.get(i) as List
                    str = list.get(0)
                }else {
                    str = params.get(i) as String
                }
                if (ObjectUtils.isNotEmpty(testContext.get(str))) {
                    req.add(testContext.get(str).toString())
                    reqMapForLog.put(str,testContext.get(str))
                }
            }
        }
        Object result = DubboService.invoke(address,interfaceName,methodName,version,group,timeOut,paramsType as String[],req as Object[])
        testContext.put("response",result)
        testContext.appendLog("interface:"+interfaceName)
        testContext.appendLog("method:"+methodName)
        testContext.appendLog("params:"+JsonUtil.prettyJson(JsonUtil.toJsonString(reqMapForLog)))
        testContext.appendLog("response:"+ JsonUtil.prettyJson(JsonUtil.toJsonString(result)))
        testContext.put("allure_interface",interfaceName)
        testContext.put("allure_method", methodName)
        testContext.put("allure_params", reqMapForLog)
        testContext.put("allure_response", result)
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
