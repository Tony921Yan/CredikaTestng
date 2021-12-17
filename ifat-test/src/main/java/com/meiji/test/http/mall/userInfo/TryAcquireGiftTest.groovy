package com.meiji.test.http.mall.userInfo


import com.meiji.biz.request.http.mall.userInfo.ThankSender
import com.meiji.biz.request.http.mall.userInfo.TryAcquireGift
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class TryAcquireGiftTest extends BaseTest {
    TryAcquireGift tryAcquireGift = new TryAcquireGift()
    @Test(description = "领取礼包 tryAcquireGift" ,groups = ["prod","uat"],testName = "tryAcquireGift",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void tryAcquireGift(TestContext testContext){
        testContext .put("addressId",1450167892967456)
        testContext .put("giftId",1453422125514784)
        testContext .put("nickname","Tony Yan")
        testContext .put("avatar","https://thirdwx.qlogo.cn/mmopen/vi_32/qzaEHcSVEIg6SlTPX0eNfuz7tXu1jknTf666U0qbFNtN04ZThtaXFgPe6rWWicrQxvyIb7fVrHzM5luvoCib1CsA/132")
        tryAcquireGift.invoke(testContext).baseAssert(testContext)
    }
}
