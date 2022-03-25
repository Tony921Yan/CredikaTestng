package com.meiji.biz.request.http.platform.activeMainManage

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class AdditionalBonds extends PlatformPost{
    {
        super.api = "activeMainManage/additionalBonds"
       super.params = ["activeId","coupons"]
    }

    AdditionalBonds invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    AdditionalBonds preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    AdditionalBonds baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }


}
