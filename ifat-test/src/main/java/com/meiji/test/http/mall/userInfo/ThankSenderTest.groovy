package com.meiji.test.http.mall.userInfo

import com.meiji.biz.request.http.mall.userInfo.GiftCreateGift
import com.meiji.biz.request.http.mall.userInfo.ThankSender
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class ThankSenderTest extends BaseTest {
    ThankSender thankSender = new ThankSender()
    @Test(description = "发送答谢语 thankSender" ,groups = ["prod","uat"],testName = "thankSender",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void thankSender(TestContext testContext){
        testContext .put("text","激动到尖叫，这礼物我超喜欢！爱你哟")
        testContext .put("url","https://static.meiji8888.com/mj-shop/upload/1639729301106.jpg")
        testContext .put("giftId",1453418927357984)
        testContext .put("userId",1429851454046240)
        thankSender.invoke(testContext).baseAssert(testContext)
    }
}
