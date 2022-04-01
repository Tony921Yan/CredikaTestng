package com.meiji.biz.request.http.platform.suppiler
import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class Audit extends PlatformPost{
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
