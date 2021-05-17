package com.meiji.test.http.mall

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.mall.AddUserAddress
import com.meiji.request.http.mall.GetUserAgreement
import org.testng.annotations.Test

class GetUserAgreementTest extends BaseTest {
    GetUserAgreement getUserAgreement = new GetUserAgreement()
    @Test(description = "获取用户协议 getUserAgreement" ,groups = ["prod","uat"],testName = "getUserAgreement",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getUserAgreement(TestContext testContext){
        getUserAgreement.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
