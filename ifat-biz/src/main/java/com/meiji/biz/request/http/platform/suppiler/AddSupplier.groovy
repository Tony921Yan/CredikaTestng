package com.meiji.biz.request.http.platform.suppiler

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class AddSupplier extends PlatformPost{
    {
        super.api="/platform/supplierMgr/addSupplier"
        super.params = ["name","contacts","phone","legalPersonPhone","email","address","addressDetail",
        "remark","createBy","updateBy","gmtCreate","gmtModified"]
    }

    AddSupplier invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    AddSupplier preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    AddSupplier baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
