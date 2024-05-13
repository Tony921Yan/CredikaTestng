package com.credika.test.http.OMS.account

import com.credika.biz.request.http.OMS.account.GetAccountName
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetAccountNameTest extends BaseTest {
    GetAccountName getAccountName = new GetAccountName()
    @Test(description = "获取供应商账户名称 getAccountName" ,groups = ["prod","uat"],testName = "OMSgetAccountName",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getAccountName(TestContext testContext){
        getAccountName.invoke(testContext).baseAssert(testContext)
    }
}
