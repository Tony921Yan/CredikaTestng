package com.meiji.biz.request.http.platform.coupon

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class CouponDataListByPage extends PlatformPost{
    {
        super.api = "CouponManage/couponDataListByPage"
       super.params = ["couponIds","discountType","expiryEnd","expiryStart","id","isExchangeFraction","name","searchNewUserCoupon","page","rows","status"]
    }

    CouponDataListByPage invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    CouponDataListByPage preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    CouponDataListByPage baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }


}
