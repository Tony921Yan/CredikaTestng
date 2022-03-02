package com.meiji.biz.request.http.platform.grantCouponActive
import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class GetActiveByPage extends PlatformPost{
    {
        super.api="grantCouponActive/getActiveByPage"
        super.params = ["condition","page","rows"]
    }

    GetActiveByPage invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetActiveByPage preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetActiveByPage baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}