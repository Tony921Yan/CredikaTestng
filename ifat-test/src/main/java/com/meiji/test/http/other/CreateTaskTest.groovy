package com.meiji.test.http.other


import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class CreateTaskTest extends BaseTest {
    com.meiji.biz.request.http.other.CreateTask createTask = new com.meiji.biz.request.http.other.CreateTask()
    @Test(description = "创建任务 createTask" ,groups = ["prod","uat"],testName = "createTask",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void createTask(TestContext testContext){
        createTask.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
