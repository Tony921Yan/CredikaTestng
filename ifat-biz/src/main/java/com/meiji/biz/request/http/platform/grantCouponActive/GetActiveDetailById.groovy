package com.meiji.biz.request.http.platform.grantCouponActive
import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class GetActiveDetailById extends PlatformPost{
    {
        super.api="grantCouponActive/getActiveDetailById"
        super.params = ["id"]
    }

    GetActiveDetailById invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetActiveDetailById preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetActiveDetailById baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}