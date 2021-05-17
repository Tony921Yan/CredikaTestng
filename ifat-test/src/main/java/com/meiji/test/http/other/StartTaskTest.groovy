package com.meiji.test.http.other

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.other.StartTask
import org.testng.annotations.Test

class StartTaskTest extends BaseTest {
    StartTask startTask = new StartTask()
    @Test(description = "开始处理任务 startTask" ,groups = ["prod","uat"],testName = "startTask",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void startTask(TestContext testContext){
        startTask.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
