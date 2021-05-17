package com.meiji.test.http.other


import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetTaskByPageTest extends BaseTest {
    com.meiji.biz.request.http.other.GetTaskByPage getTaskByPage = new com.meiji.biz.request.http.other.GetTaskByPage()
    @Test(description = "获取任务列表 getTaskByPage" ,groups = ["prod","uat"],testName = "getTaskByPage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getTaskByPage(TestContext testContext){
        getTaskByPage.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
