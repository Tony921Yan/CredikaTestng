package com.credika.biz.request.http.platform.suppiler


import com.miyuan.ifat.support.test.TestContext

class Apply extends com.credika.biz.request.http.platform.PlatformGet{
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
