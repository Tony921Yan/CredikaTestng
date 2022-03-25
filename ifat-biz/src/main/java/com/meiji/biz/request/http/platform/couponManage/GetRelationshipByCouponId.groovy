package com.meiji.biz.request.http.platform.couponManage

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class GetRelationshipByCouponId extends PlatformPost{
    {
        super.api = "CouponManage/getRelationshipByCouponId"
       super.params = ["id"]
    }

    GetRelationshipByCouponId invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetRelationshipByCouponId preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetRelationshipByCouponId baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }


}
