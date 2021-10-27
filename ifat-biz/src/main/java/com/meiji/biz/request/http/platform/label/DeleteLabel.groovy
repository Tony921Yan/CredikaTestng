package com.meiji.biz.request.http.platform.label

import com.meiji.biz.request.http.platform.PlatformGet
import com.miyuan.ifat.support.test.TestContext

class DeleteLabel extends PlatformGet{
    {
        super.api="/platform/goodsLabel/addLabel"
        super.params = ["id"]
    }

    DeleteLabel invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    DeleteLabel preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    DeleteLabel baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
