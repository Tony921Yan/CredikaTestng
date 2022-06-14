package com.meiji.biz.request.http.platform.live
import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class DeleteRole extends PlatformPost{
    {
        super.api="Platform/editRole"
        super.params = ["role","username"]
    }

    DeleteRole invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    DeleteRole preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    DeleteRole baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
