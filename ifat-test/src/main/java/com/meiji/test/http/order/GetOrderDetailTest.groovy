package com.meiji.test.http.order

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.order.CancelOrder
import com.meiji.request.http.order.GetOrderDetail
import org.testng.annotations.Test

class GetOrderDetailTest extends BaseTest {
    GetOrderDetail getOrderDetail = new GetOrderDetail() //order_info 表中id=80查询详情
    @Test(description = "获取订单详情,包含会员信息 和 分销信息 和 支付信息 和 商品信息 getOrderDetail" ,groups = ["prod","uat"],testName = "getOrderDetail",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderDetail(TestContext testContext){
        getOrderDetail.invoke(testContext).baseAssert(testContext)
    }
}
