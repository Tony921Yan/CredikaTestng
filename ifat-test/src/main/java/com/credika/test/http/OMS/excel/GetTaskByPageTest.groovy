package com.credika.test.http.OMS.excel


import com.credika.biz.request.http.OMS.excel.GetTaskByPage
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetTaskByPageTest extends BaseTest {
    GetTaskByPage getTaskByPage = new GetTaskByPage()
    @Test(description = "获取任务列表 getTaskByPage" ,groups = ["prod","uat"],testName = "oms_getTaskByPage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getTaskByPage(TestContext testContext){
        getTaskByPage.invoke(testContext).baseAssert(testContext)
    }
}
