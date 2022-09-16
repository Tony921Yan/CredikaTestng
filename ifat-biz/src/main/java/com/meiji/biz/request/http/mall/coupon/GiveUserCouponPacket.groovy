package com.meiji.biz.request.http.mall.coupon

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class GiveUserCouponPacket extends MallPost{
    {
        super.api = "coupon/giveUserCouponPacket"
       super.params = ["activityId","userId"]
    }

    GiveUserCouponPacket invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GiveUserCouponPacket preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GiveUserCouponPacket baseAssert(TestContext testContext){
        // assert testContext.getResponse().code == 10
        super.baseAssert(testContext)
        return this
    }


}
