package com.meiji.biz.request.http.platform.live
import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class EditRole extends PlatformPost{
    {
        super.api="Platform/editRole"
        super.params = ["role","username"]
    }

    EditRole invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    EditRole preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    EditRole baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
