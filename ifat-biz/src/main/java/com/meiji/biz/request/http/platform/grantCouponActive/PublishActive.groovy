package com.meiji.biz.request.http.platform.grantCouponActive
import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class PublishActive extends PlatformPost{
    {
        super.api="grantCouponActive/publishActive"
        super.params = ["id"]
    }

    PublishActive invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    PublishActive preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    PublishActive baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}