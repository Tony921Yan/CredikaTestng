package com.meiji.test.http.other

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.other.CreateTask
import com.meiji.request.http.other.GetTaskByPage
import org.testng.annotations.Test

class GetTaskByPageTest extends BaseTest {
    GetTaskByPage getTaskByPage = new GetTaskByPage()
    @Test(description = "获取任务列表 getTaskByPage" ,groups = ["prod","uat"],testName = "getTaskByPage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getTaskByPage(TestContext testContext){
        getTaskByPage.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
