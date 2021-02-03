package com.miyuan.request.api.goods

import com.miyuan.com.TestContext
import com.miyuan.factory.MiyuanRequest

class CouponGetCouponUrl extends MiyuanRequest {
    {
        super.api = "/api/coupon/getCouponUrl"
        super.params =  [ "itemSourceId", "itemSource", "platform", "couponUrl", "material","couponShareUrl", "type",
                          "brandId", "supplierCode", "searchId", "pgActionId", "externalType", "giftCouponKey"]
        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    MiyuanRequest invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    MiyuanRequest preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    MiyuanRequest baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

    MiyuanRequest specialAssert(TestContext testContext){

    }
}
