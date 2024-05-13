package com.credika.test.http.mall.gift

import com.credika.biz.request.http.mall.gift.GiftCreateGift
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GiftCreateGiftTest extends BaseTest {
    GiftCreateGift giftCreateGift = new GiftCreateGift()
    @Test(description = "创建礼包 giftCreateGift" ,groups = ["prod","uat"],testName = "giftCreateGift",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void giftCreateGift(TestContext testContext){
        giftCreateGift.invoke(testContext).baseAssert(testContext)
    }
}
