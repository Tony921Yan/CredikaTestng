package com.meiji.biz.request.http.platform.live
import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class DeleteLive extends PlatformPost{
    {
        super.api="Platform/deleteLive"
        super.params = ["id"]
    }

    DeleteLive invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    DeleteLive preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    DeleteLive baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
