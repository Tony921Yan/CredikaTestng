package com.credika.biz.request.http.mall.coupon

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class GetNewVipCouponsForUser extends MallPost{
    {
        super.api = "coupon/getNewVipCouponsForUser"
       super.params = ["userId"]
    }

    GetNewVipCouponsForUser invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetNewVipCouponsForUser preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetNewVipCouponsForUser baseAssert(TestContext testContext){
        // assert testContext.getResponse().code == 10
        super.baseAssert(testContext)
        return this
    }


}
