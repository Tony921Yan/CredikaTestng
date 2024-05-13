package com.credika.test.http.platform.orderDetailManage


import com.credika.biz.request.http.platform.orderDetailManage.UpdateOrderRemark
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class UpdateOrderRemarkTest extends BaseTest {//平台备注接口platform_remark
    UpdateOrderRemark updateOrderRemark = new UpdateOrderRemark()
    @Test(description = "修改订单备注-异常场景：线上O2021051217430555831 updateOrderRemark" ,groups = ["prod","uat"],testName = "updateOrderRemark-p",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateOrderRemark(TestContext testContext){
        updateOrderRemark.invoke(testContext).baseAssert(testContext)
    }
}
