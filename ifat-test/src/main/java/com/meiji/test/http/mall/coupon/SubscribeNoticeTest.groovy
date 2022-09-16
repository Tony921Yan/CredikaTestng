package com.meiji.test.http.mall.coupon



import com.meiji.biz.request.http.mall.coupon.SubscribeNotice
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class SubscribeNoticeTest extends BaseTest {
    SubscribeNotice subscribeNotice = new SubscribeNotice()
    @Test(description = "订阅消息提醒 subscribeNotice" ,groups = ["prod","uat"],testName = "subscribeNotice-coupon",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void subscribeNotice(TestContext testContext){
        subscribeNotice.invoke(testContext).baseAssert(testContext)
    }
}