package com.meiji.test.http.platform.orderafter

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.meiji.biz.request.http.platform.orderafter.AuditOrderAfter
import org.testng.annotations.Test

class AuditOrderAfterTest extends BaseTest {
    AuditOrderAfter auditOrderAfter = new AuditOrderAfter()
    @Test(description = "审核售后单 auditOrderAfter" ,groups = ["prod","uat"],testName = "auditOrderAfter",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void auditOrderAfter(TestContext testContext){
        auditOrderAfter.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
