package com.meiji.biz.request.http.platform.coupon

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class List extends PlatformPost{
    {
        super.api = "CouponManage/list"
       super.params = ["couponIds","discountType","expiryEnd","expiryStart","id","isExchangeFraction","name","searchNewUserCoupon","page","rows","status"]
    }

    List invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    List preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    List baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }


}
