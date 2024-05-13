package com.credika.test.http.mall.gift

import com.credika.biz.request.http.mall.gift.ListGiftsFromMe
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class ListGiftsFromMeTest extends BaseTest {
    ListGiftsFromMe listGiftsFromMe = new ListGiftsFromMe()
    @Test(description = "赠礼详情-我赠送的 listGiftsFromMe" ,groups = ["prod","uat"],testName = "listGiftsFromMe",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void listGiftsFromMe(TestContext testContext){
        testContext.put("page",1)
        testContext.put("rows",10)
        listGiftsFromMe.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
