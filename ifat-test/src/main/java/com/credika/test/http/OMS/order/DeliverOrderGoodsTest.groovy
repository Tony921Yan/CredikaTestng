package com.credika.test.http.OMS.order
import com.credika.biz.request.http.OMS.order.DeliverOrderGoods
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class DeliverOrderGoodsTest extends BaseTest {
    DeliverOrderGoods deliverOrderGoods = new DeliverOrderGoods()
    @Test(description = "订单发货 deliverOrderGoods" ,groups = ["prod","uat"],testName = "OMSdeliverOrderGoods",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void deliverOrderGoods(TestContext testContext){
        deliverOrderGoods.invoke(testContext).baseAssert(testContext)
    }
}
