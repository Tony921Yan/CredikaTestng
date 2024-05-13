package com.credika.test.http.OMS.account





import com.credika.biz.request.http.OMS.account.Withdraw
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class WithdrawTest extends BaseTest {
    Withdraw withdraw = new Withdraw()
    @Test(description = "供应商提现 withdraw" ,groups = ["prod","uat"],testName = "OMSwithdraw",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void withdraw(TestContext testContext){
        withdraw.invoke(testContext).baseAssert(testContext)
    }
}
