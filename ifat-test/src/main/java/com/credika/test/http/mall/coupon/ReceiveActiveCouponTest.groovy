package com.credika.test.http.mall.coupon

import com.credika.biz.request.http.mall.coupon.ReceiveActiveCoupon
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class ReceiveActiveCouponTest extends BaseTest {
    ReceiveActiveCoupon receiveActiveCoupon = new ReceiveActiveCoupon()
    @Test(description = "领券活动 receiveActiveCoupon" ,groups = ["prod","uat"],testName = "receiveActiveCoupon",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void receiveActiveCoupon(TestContext testContext){
       // testContext.put("activeId",1)    //一键领取
        receiveActiveCoupon.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "领券活动 receiveActiveCoupon" ,groups = ["prod","uat"],testName = "receiveActiveCoupon1",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void receiveActiveCoupon1(TestContext testContext){
       // testContext.put("activeId",1)
       // testContext.put("couponId",1)   //单张领取
        receiveActiveCoupon.invoke(testContext).baseAssert(testContext)
    }
}