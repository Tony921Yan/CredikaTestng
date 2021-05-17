package com.meiji.test.http.orderafter

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.orderafter.AuditOrderAfter
import org.testng.annotations.Test

class AuditOrderAfterTest extends BaseTest {
    AuditOrderAfter auditOrderAfter = new AuditOrderAfter()
    @Test(description = "审核售后单 auditOrderAfter" ,groups = ["prod","uat"],testName = "auditOrderAfter",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void auditOrderAfter(TestContext testContext){
        auditOrderAfter.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
