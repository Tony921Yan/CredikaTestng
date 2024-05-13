package com.credika.test.http.OMS.excel

import com.credika.biz.request.http.OMS.excel.CreateTask
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class CreateTaskTest extends BaseTest {
    CreateTask createTask = new CreateTask()
    @Test(description = "创建任务 createTask" ,groups = ["prod","uat"],testName = "oms_createTask",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void createTask(TestContext testContext){
        createTask.invoke(testContext).baseAssert(testContext)
    }
}
