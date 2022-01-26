package com.meiji.biz.request.http.platform.integral

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class EnableTask extends PlatformPost{
    {
        super.api="/TaskManage/enableTask"
        super.params = ["id"]
    }

    EnableTask invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    EnableTask preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    EnableTask baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}