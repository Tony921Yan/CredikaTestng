package com.meiji.test.http.platform.other

import com.meiji.biz.request.http.platform.other.CreateTask
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class CreateTaskTest extends BaseTest {
    CreateTask createTask = new CreateTask()
    @Test(description = "创建任务 createTask" ,groups = ["prod","uat"],testName = "createTask",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void createTask(TestContext testContext){
        createTask.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
