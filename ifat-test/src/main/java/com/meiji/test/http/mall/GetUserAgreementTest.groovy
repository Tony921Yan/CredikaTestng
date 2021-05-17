package com.meiji.test.http.mall


import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetUserAgreementTest extends BaseTest {
    com.meiji.biz.request.http.mall.GetUserAgreement getUserAgreement = new com.meiji.biz.request.http.mall.GetUserAgreement()
    @Test(description = "获取用户协议 getUserAgreement" ,groups = ["prod","uat"],testName = "getUserAgreement",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getUserAgreement(TestContext testContext){
        getUserAgreement.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
