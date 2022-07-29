package com.meiji.test.http.platform.asyncManage

import com.meiji.biz.request.http.platform.asyncManage.GetOrderAsyncExportTaskByPage
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetOrderAsyncExportTaskByPageTest extends BaseTest{
    GetOrderAsyncExportTaskByPage getOrderAsyncExportTaskByPage = new GetOrderAsyncExportTaskByPage()
    @Test(description = "异步管理列表" ,groups = ["prod","uat"],testName = "getOrderAsyncExportTaskByPage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    void getOrderAsyncExportTaskByPage(TestContext testContext){
        getOrderAsyncExportTaskByPage.invoke(testContext).baseAssert(testContext)
//        getOrderAsyncExportTaskByPage.specialAssert(testContext)
    }
}
