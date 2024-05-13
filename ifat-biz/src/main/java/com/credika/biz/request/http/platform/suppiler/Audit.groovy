package com.credika.biz.request.http.platform.suppiler


import com.miyuan.ifat.support.test.TestContext

class Audit extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api="/SupplierManage/audit"
        super.params = ["auditMessage","id","status","nickname","username"]
    }

    Audit invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    Audit preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    Audit baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
