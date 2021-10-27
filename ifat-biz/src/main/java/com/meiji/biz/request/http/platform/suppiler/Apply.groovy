package com.meiji.biz.request.http.platform.suppiler

import com.meiji.biz.request.http.platform.PlatformGet
import com.miyuan.ifat.support.test.TestContext

class Apply extends PlatformGet{
    {
        super.api="/platform/supplierMgr/apply"
        super.params = [""]
    }

    Apply invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    Apply preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    Apply baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
