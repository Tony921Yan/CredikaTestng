package com.credika.test.http.platform.other

import com.credika.biz.request.http.platform.other.StartTask
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class StartTaskTest extends BaseTest {
    StartTask startTask = new StartTask()
    @Test(description = "开始处理任务 startTask" ,groups = ["prod","uat"],testName = "startTask",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void startTask(TestContext testContext){
        startTask.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
