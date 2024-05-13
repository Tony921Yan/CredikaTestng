package com.credika.biz.request.http.platform.integral


import com.miyuan.ifat.support.test.TestContext

class DisableTask extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api="/TaskManage/disableTask"
        super.params = ["id"]
    }

    DisableTask invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    DisableTask preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    DisableTask baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}