package com.credika.biz.request.http.platform.couponManage


import com.miyuan.ifat.support.test.TestContext

class CouponInstanceListByPage extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api = "CouponManage/couponInstanceListByPage"
       super.params = ["couponIds","discountType","expiryEnd","expiryStart","id","isExchangeFraction","name","searchNewUserCoupon","page","rows","status","grantCouponActiveName","receiveCouponTimeStart","receiveCouponTimeEnd"]
    }

    CouponInstanceListByPage invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    CouponInstanceListByPage preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    CouponInstanceListByPage baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }


}
