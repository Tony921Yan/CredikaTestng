package com.meiji.com

import com.meiji.util.JsonUtil
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
        for (Object str:log){
            Reporter.log(JsonUtil.prettyJson(str))
            println(JsonUtil.prettyJson(str))
        }
        if (++m_count % 40 == 0) {
            println("")
        }
    }

    //测试步骤
    public static void caseStep(def url, def headers, def param, def response)
    {
        def jsonOutput = new JsonOutput()
        Allure.addAttachment("接口", url.toString())
        Allure.addAttachment("请求头", JsonUtil.prettyJson(headers))
        Allure.addAttachment("参数", JsonUtil.prettyJson(param))
        Allure.addAttachment("响应", JsonUtil.prettyJson(response))
    }

}
