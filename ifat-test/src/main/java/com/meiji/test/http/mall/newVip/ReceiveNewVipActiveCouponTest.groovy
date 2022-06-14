package com.meiji.test.http.mall.newVip


import com.meiji.biz.request.http.mall.newVip.GetActivityGoods
import com.meiji.biz.request.http.mall.newVip.ReceiveNewVipActiveCoupon
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class ReceiveNewVipActiveCouponTest extends BaseTest {
    ReceiveNewVipActiveCoupon receiveNewVipActiveCoupon = new ReceiveNewVipActiveCoupon()
    @Test(description = "新会员领券-老会员领取失败 receiveNewVipActiveCoupon" ,groups = ["prod","uat"],testName = "receiveNewVipActiveCoupon",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void receiveNewVipActiveCoupon(TestContext testContext){
        receiveNewVipActiveCoupon.invoke(testContext).baseAssert(testContext)
    }
}