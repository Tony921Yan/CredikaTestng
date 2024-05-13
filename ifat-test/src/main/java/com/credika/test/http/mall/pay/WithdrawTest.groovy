package com.credika.test.http.mall.pay

import com.credika.biz.request.http.mall.pay.Withdraw
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class WithdrawTest extends BaseTest {
    Withdraw withdraw = new Withdraw()
    @Test(description = "店铺提现 withdraw" ,groups = ["prod","uat"],testName = "withdraw",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void withdraw(TestContext testContext){
        testContext.put("amount",98)
        testContext.put("userId",10069)
        testContext.put("shopId",1415202752954400)
        testContext.put("remark","test only")
        withdraw.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
