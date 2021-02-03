package com.miyuan.com

import com.miyuan.util.JsonUtil
import org.testng.ITestResult
import org.testng.Reporter
import org.testng.TestListenerAdapter
import io.qameta.allure.Allure
import groovy.json.JsonOutput

class CustomListener extends TestListenerAdapter{
    private int m_count = 0

    @Override
    public void onTestFailure(ITestResult tr) {
        TestContext testContext = tr.getParameters() as TestContext
        log(testContext.get("log") as List)
        caseStep(testContext.get("allure_url"), testContext.get("allure_headers"), testContext.get("allure_params"), testContext.get("allure_response"))
    }

    @Override
    public void onTestSkipped(ITestResult tr) {
        TestContext testContext = tr.getParameters() as TestContext
        log(testContext.get("log")  as List)
        caseStep(testContext.get("allure_url"), testContext.get("allure_headers"), testContext.get("allure_params"), testContext.get("allure_response"))
    }

    @Override
    public void onTestSuccess(ITestResult tr) {
        TestContext testContext = tr.getParameters() as TestContext
        log(testContext.get("log") as List)
        caseStep(testContext.get("allure_url"), testContext.get("allure_headers"), testContext.get("allure_params"), testContext.get("allure_response"))
    }

    private void log(List log) {
        for (String str:log){
            Reporter.log(str)
            println(str)
        }
        if (++m_count % 40 == 0) {
            println("")
        }
    }

    //测试步骤
    public void caseStep(def url, def headers, def param, String response)
    {
        def jsonOutput = new JsonOutput()
        Allure.addAttachment("接口地址", url.toString())
        Allure.addAttachment("Headers", jsonOutput.prettyPrint(jsonOutput.toJson(headers)))
        Allure.addAttachment("请求JSON", jsonOutput.prettyPrint(jsonOutput.toJson(param)))
        Allure.addAttachment("请求响应", JsonUtil.prettyJson(response))
    }

}
