package com.meiji.test.http.platform.aftersalesDetailManage

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.meiji.biz.request.http.platform.aftersalesDetailManage.AuditRefundMoney
import org.testng.annotations.Test

class AuditRefundMoneyTest extends BaseTest {
    AuditRefundMoney auditRefundMoney = new AuditRefundMoney()
    @Test(description = "审核退款售后单-异常场景-非审核状态时抛异常 auditRefundMoney" ,groups = ["prod","uat"],testName = "auditRefundMoney-p",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void auditRefundMoney(TestContext testContext){
        auditRefundMoney.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
