package com.credika.biz.request.http.platform.integral


import com.miyuan.ifat.support.test.TestContext

class DeteleTask extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api="/TaskManage/deteleTask"
        super.params = ["id"]
    }

    DeteleTask invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    DeteleTask preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    DeteleTask baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}