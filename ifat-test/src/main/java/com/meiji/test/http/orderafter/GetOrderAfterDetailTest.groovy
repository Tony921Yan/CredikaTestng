package com.meiji.test.http.orderafter

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.orderafter.ExportOrderAfter
import com.meiji.request.http.orderafter.GetOrderAfterByPage
import com.meiji.request.http.orderafter.GetOrderAfterDetail
import org.testng.annotations.Test

class GetOrderAfterDetailTest extends BaseTest {
    GetOrderAfterDetail getOrderAfterDetail = new GetOrderAfterDetail()
    @Test(description = "获取售后单详情 getOrderAfterDetail" ,groups = ["prod","uat"],testName = "getOrderAfterDetail",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderAfterDetail(TestContext testContext){
        getOrderAfterDetail.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
