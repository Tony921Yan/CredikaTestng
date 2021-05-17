package com.meiji.test.http.orderafter

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.orderafter.AuditOrderAfter
import com.meiji.request.http.orderafter.AuditRefundMoney
import org.testng.annotations.Test

class AuditRefundMoneyTest extends BaseTest {
    AuditRefundMoney auditRefundMoney = new AuditRefundMoney()
    @Test(description = "审核退款售后单 auditRefundMoney" ,groups = ["prod","uat"],testName = "auditRefundMoney",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void auditRefundMoney(TestContext testContext){
        auditRefundMoney.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
