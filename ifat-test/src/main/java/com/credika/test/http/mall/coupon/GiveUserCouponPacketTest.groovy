package com.credika.test.http.mall.coupon


import com.credika.biz.request.http.mall.coupon.GiveUserCouponPacket
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GiveUserCouponPacketTest extends BaseTest {
    GiveUserCouponPacket giveUserCouponPacket = new GiveUserCouponPacket()
    @Test(description = "给用户券包-失败 giveUserCouponPacket" ,groups = ["prod","uat"],testName = "giveUserCouponPacket-mall-0",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void giveUserCouponPacket(TestContext testContext){
        giveUserCouponPacket.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "给用户券包-已领取 giveUserCouponPacket" ,groups = ["prod","uat"],testName = "giveUserCouponPacket-mall-2",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void giveUserCouponPacket2(TestContext testContext){
        giveUserCouponPacket.invoke(testContext).baseAssert(testContext)
    }

/*    @Test(description = "给用户券包-成功 giveUserCouponPacket" ,groups = ["prod","uat"],testName = "giveUserCouponPacket-mall-1",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void giveUserCouponPacket1(TestContext testContext){
        giveUserCouponPacket.invoke(testContext).baseAssert(testContext)
    }

 */
}