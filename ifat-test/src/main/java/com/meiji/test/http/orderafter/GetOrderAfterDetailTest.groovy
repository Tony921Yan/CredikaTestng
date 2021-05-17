package com.meiji.test.http.orderafter

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.meiji.biz.request.http.orderafter.GetOrderAfterDetail
import org.testng.annotations.Test

class GetOrderAfterDetailTest extends BaseTest {
    GetOrderAfterDetail getOrderAfterDetail = new GetOrderAfterDetail()
    @Test(description = "获取售后单详情 getOrderAfterDetail" ,groups = ["prod","uat"],testName = "getOrderAfterDetail",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderAfterDetail(TestContext testContext){
        getOrderAfterDetail.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
