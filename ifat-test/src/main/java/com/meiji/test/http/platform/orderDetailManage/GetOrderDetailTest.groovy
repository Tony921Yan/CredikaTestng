package com.meiji.test.http.platform.orderDetailManage
import com.meiji.biz.request.http.platform.orderDetailManage.GetOrderDetail
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetOrderDetailTest extends BaseTest {
    GetOrderDetail getOrderDetail = new GetOrderDetail()
    @Test(description = "获取订单详情,包含会员信息 和 分销信息 和 支付信息 和 商品信息 getOrderDetail" ,groups = ["prod","uat"],testName = "getOrderDetail-p",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderDetail(TestContext testContext){
        getOrderDetail.invoke(testContext).baseAssert(testContext)
    }
}
