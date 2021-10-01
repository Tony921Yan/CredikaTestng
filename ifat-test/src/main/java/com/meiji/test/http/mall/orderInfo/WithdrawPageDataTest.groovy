package com.meiji.test.http.mall.orderInfo

import com.meiji.biz.request.http.mall.orderInfo.WithdrawPageData
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
