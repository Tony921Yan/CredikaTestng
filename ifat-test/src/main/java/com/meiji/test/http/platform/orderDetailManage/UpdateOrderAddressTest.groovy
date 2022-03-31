package com.meiji.test.http.platform.orderDetailManage

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.meiji.biz.request.http.platform.orderDetailManage.UpdateOrderAddress
import org.testng.annotations.Test

class UpdateOrderAddressTest extends BaseTest {//t特定场景才生效
    UpdateOrderAddress updateOrderAddress = new UpdateOrderAddress()
    @Test(description = "修改订单收货信息 updateOrderAddress" ,groups = ["prod","uat"],testName = "updateOrderAddress-p",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateOrderAddress(TestContext testContext){
        updateOrderAddress.invoke(testContext).baseAssert(testContext)
    }
}
