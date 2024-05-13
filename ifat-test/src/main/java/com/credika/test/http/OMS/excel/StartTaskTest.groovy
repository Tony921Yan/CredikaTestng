package com.credika.test.http.OMS.excel

import com.credika.biz.request.http.OMS.excel.StartTask
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class StartTaskTest extends BaseTest {
    StartTask startTask = new StartTask()
    @Test(description = "开始处理任务 startTask" ,groups = ["prod","uat"],testName = "oms_startTask",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void startTask(TestContext testContext){
        startTask.invoke(testContext).baseAssert(testContext)
    }
}
