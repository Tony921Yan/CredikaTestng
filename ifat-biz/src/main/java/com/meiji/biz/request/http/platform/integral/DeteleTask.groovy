package com.meiji.biz.request.http.platform.integral
import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class DeteleTask extends PlatformPost{
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