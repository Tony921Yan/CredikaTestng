package com.meiji.test.http.other


import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class StartTaskTest extends BaseTest {
    com.meiji.biz.request.http.other.StartTask startTask = new com.meiji.biz.request.http.other.StartTask()
    @Test(description = "开始处理任务 startTask" ,groups = ["prod","uat"],testName = "startTask",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void startTask(TestContext testContext){
        startTask.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
