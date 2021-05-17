package com.meiji.test.http.order

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.order.CancelOrder
import com.meiji.request.http.order.UpdateOrderAddress
import org.testng.annotations.Test

class UpdateOrderAddressTest extends BaseTest {
    UpdateOrderAddress updateOrderAddress = new UpdateOrderAddress()
    @Test(description = "修改订单收货信息 updateOrderAddress" ,groups = ["prod","uat"],testName = "updateOrderAddress",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateOrderAddress(TestContext testContext){
        updateOrderAddress.invoke(testContext).baseAssert(testContext)
    }
}
