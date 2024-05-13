package com.credika.test.http.platform.applicationList

import com.credika.biz.request.http.platform.applicationList.AuditCompensation
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class AuditCompensationTest extends BaseTest {
    AuditCompensation auditCompensation = new AuditCompensation()
    @Test(description = "审核买贵赔订单-优惠券 auditCompensation" ,groups = ["prod","uat"],testName = "auditCompensation-p",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void auditCompensation(TestContext testContext){
        auditCompensation.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }

    @Test(description = "审核买贵赔订单-返现 auditCompensation" ,groups = ["prod","uat"],testName = "auditCompensation-p1",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void auditCompensation1(TestContext testContext){
        auditCompensation.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }


}
