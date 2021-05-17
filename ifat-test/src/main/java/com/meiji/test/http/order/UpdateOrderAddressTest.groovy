package com.meiji.test.http.order

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.meiji.biz.request.http.order.UpdateOrderAddress
import org.testng.annotations.Test

class UpdateOrderAddressTest extends BaseTest {
    UpdateOrderAddress updateOrderAddress = new UpdateOrderAddress()
    @Test(description = "修改订单收货信息 updateOrderAddress" ,groups = ["prod","uat"],testName = "updateOrderAddress",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateOrderAddress(TestContext testContext){
        updateOrderAddress.invoke(testContext).baseAssert(testContext)
    }
}
