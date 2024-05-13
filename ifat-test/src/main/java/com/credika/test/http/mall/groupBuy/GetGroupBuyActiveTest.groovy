package com.credika.test.http.mall.groupBuy

import com.credika.biz.request.http.mall.groupBuy.GetGroupBuyActive
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetGroupBuyActiveTest extends BaseTest {
    GetGroupBuyActive getGroupBuyActive = new GetGroupBuyActive()
    @Test(description = "查询群友内购活动 getGroupBuyActive" ,groups = ["prod","uat"],testName = "getGroupBuyActive",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getGroupBuyActive(TestContext testContext){
        getGroupBuyActive.invoke(testContext).baseAssert(testContext)
    }
}