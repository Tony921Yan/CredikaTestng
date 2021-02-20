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
        caseStep(testContext.get("allure_interface"), testContext.get("allure_method"), testContext.get("allure_params"), testContext.get("allure_response"))
    }

    @Override
    public void onTestSkipped(ITestResult tr) {
        TestContext testContext = tr.getParameters() as TestContext
        log(testContext.get("log")  as List)
        caseStep(testContext.get("allure_interface"), testContext.get("allure_method"), testContext.get("allure_params"), testContext.get("allure_response"))
    }

    @Override
    public void onTestSuccess(ITestResult tr) {
        TestContext testContext = tr.getParameters() as TestContext
        log(testContext.get("log") as List)
        caseStep(testContext.get("allure_interface"), testContext.get("allure_method"), testContext.get("allure_params"), testContext.get("allure_response"))
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
    public void caseStep(def interfaceName, def methodName, def param, String response)
    {
        def jsonOutput = new JsonOutput()
        Allure.addAttachment("接口", interfaceName.toString())
        Allure.addAttachment("方法", methodName.toString())
        Allure.addAttachment("参数", jsonOutput.prettyPrint(jsonOutput.toJson(param)))
        Allure.addAttachment("响应", JsonUtil.prettyJson(response))
    }

}
