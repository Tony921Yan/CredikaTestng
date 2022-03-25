package com.meiji.biz.request.http.platform.couponManage

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class Del extends PlatformPost{
    {
        super.api = "CouponManage/del"
       super.params = ["id"]
    }

    Del invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    Del preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    Del baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }


}
