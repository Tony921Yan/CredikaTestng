package com.credika.test.http.platform.aftersalesDetailManage

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.credika.biz.request.http.platform.aftersalesDetailManage.AuditOrderAfter
import org.testng.annotations.Test

class AuditOrderAfterTest extends BaseTest {
    AuditOrderAfter auditOrderAfter = new AuditOrderAfter()
    @Test(description = "审核售后单-异常场景-非审核状态时抛出异常 auditOrderAfter" ,groups = ["prod","uat"],testName = "auditOrderAfter-p",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void auditOrderAfter(TestContext testContext){
        auditOrderAfter.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
