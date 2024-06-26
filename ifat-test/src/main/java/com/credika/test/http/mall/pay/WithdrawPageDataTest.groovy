package com.credika.test.http.mall.pay

import com.credika.biz.request.http.mall.pay.WithdrawPageData
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class WithdrawPageDataTest extends BaseTest {
    WithdrawPageData withdrawPageData = new WithdrawPageData()
    @Test(description = "提现界面 withdrawPageData" ,groups = ["prod","uat"],testName = "withdrawPageData",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void withdrawPageData(TestContext testContext){
        testContext.put("shopId",1405981112139808)
        withdrawPageData.invoke(testContext).baseAssert(testContext)
    }
}
