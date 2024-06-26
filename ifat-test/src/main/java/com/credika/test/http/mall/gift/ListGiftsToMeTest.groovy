package com.credika.test.http.mall.gift

import com.credika.biz.request.http.mall.gift.ListGiftsToMe
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class ListGiftsToMeTest extends BaseTest {
    ListGiftsToMe listGiftsToMe = new ListGiftsToMe()
    @Test(description = "赠礼详情-我收到的 listGiftsToMe" ,groups = ["prod","uat"],testName = "listGiftsToMe",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void listGiftsToMe(TestContext testContext){
        testContext.put("page",1)
        testContext.put("rows",10)
        listGiftsToMe.invoke(testContext).baseAssert(testContext)
    }
}
