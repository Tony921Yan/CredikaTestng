package com.meiji.test.http.order

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.meiji.biz.request.http.order.AuditOrder
import org.testng.annotations.Test

class AuditOrderTest extends BaseTest { //Order_audit表
    AuditOrder auditOrder = new AuditOrder()
    @Test(description = "审核订单 auditOrder" ,groups = ["prod","uat"],testName = "auditOrder",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void auditOrder(TestContext testContext){
        auditOrder.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
