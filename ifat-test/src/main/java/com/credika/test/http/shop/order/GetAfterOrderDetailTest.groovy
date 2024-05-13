package com.credika.test.http.shop.order

import com.credika.biz.request.http.shop.order.GetAfterOrderDetail
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetAfterOrderDetailTest extends BaseTest {
    GetAfterOrderDetail getAfterOrderDetail = new GetAfterOrderDetail()
    @Test(description = "获取售后单详情 getAfterOrderDetail" ,groups = ["prod","uat"],testName = "getAfterOrderDetail",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getAfterOrderDetail(TestContext testContext){
        getAfterOrderDetail.invoke(testContext).baseAssert(testContext)
    }
}
