package com.meiji.test.http.other

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.other.CreateExcelData
import com.meiji.request.http.other.CreateTask
import org.testng.annotations.Test

class CreateTaskTest extends BaseTest {
    CreateTask createTask = new CreateTask()
    @Test(description = "创建任务 createTask" ,groups = ["prod","uat"],testName = "createTask",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void createTask(TestContext testContext){
        createTask.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
