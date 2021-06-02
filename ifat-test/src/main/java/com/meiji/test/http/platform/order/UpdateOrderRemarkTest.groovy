package com.meiji.test.http.platform.order

import com.meiji.biz.request.http.platform.order.UpdateOrderAddress
import com.meiji.biz.request.http.platform.order.UpdateOrderRemark
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class UpdateOrderRemarkTest extends BaseTest {//平台备注接口platform_remark
    UpdateOrderRemark updateOrderRemark = new UpdateOrderRemark()
    @Test(description = "修改订单备注 updateOrderRemark" ,groups = ["prod","uat"],testName = "updateOrderRemark",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateOrderRemark(TestContext testContext){
        updateOrderRemark.invoke(testContext).baseAssert(testContext)
    }
}
