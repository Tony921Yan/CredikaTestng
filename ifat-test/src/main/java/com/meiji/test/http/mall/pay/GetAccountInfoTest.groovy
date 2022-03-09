package com.meiji.test.http.mall.pay

import com.meiji.biz.request.http.mall.pay.GetAccountInfo
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetAccountInfoTest extends BaseTest {
    GetAccountInfo getAccountInfo = new GetAccountInfo()
    @Test(description = "获取银行账户信息 getAccountInfo" ,groups = ["prod","uat"],testName = "getAccountInfo",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getAccountInfo(TestContext testContext){
        testContext.put("shopId",1405981112139808)
        getAccountInfo.invoke(testContext).baseAssert(testContext)
    }
}
