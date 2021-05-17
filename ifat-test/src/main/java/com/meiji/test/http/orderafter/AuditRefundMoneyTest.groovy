package com.meiji.test.http.orderafter

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.meiji.biz.request.http.orderafter.AuditRefundMoney
import org.testng.annotations.Test

class AuditRefundMoneyTest extends BaseTest {
    AuditRefundMoney auditRefundMoney = new AuditRefundMoney()
    @Test(description = "审核退款售后单 auditRefundMoney" ,groups = ["prod","uat"],testName = "auditRefundMoney",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void auditRefundMoney(TestContext testContext){
        auditRefundMoney.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
