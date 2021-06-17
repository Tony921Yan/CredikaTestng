package com.meiji.test.http.OMS.order

import com.meiji.biz.request.http.OMS.order.GetOrderDetail
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetOrderDetailTest extends BaseTest {
    GetOrderDetail getOrderDetail = new GetOrderDetail()
    @Test(description = "获取订单详情 getOrderDetail" ,groups = ["prod","uat"],testName = "OMSgetOrderDetail",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderDetail(TestContext testContext){
        getOrderDetail.invoke(testContext).baseAssert(testContext)
    }
}
