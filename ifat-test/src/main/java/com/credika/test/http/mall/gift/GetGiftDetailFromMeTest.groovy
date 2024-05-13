package com.credika.test.http.mall.gift

import com.credika.biz.request.http.mall.gift.GetGiftDetailFromMe
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetGiftDetailFromMeTest extends BaseTest {
    GetGiftDetailFromMe getGiftDetailFromMe = new GetGiftDetailFromMe()
    @Test(description = "我赠送的礼包详情 getGiftDetailFromMe" ,groups = ["prod","uat"],testName = "getGiftDetailFromMe",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getGiftDetailFromMe(TestContext testContext){
        getGiftDetailFromMe.invoke(testContext).baseAssert(testContext)
    }
}
