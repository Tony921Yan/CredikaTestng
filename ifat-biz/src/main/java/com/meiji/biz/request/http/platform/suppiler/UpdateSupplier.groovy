package com.meiji.biz.request.http.platform.suppiler

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class UpdateSupplier extends PlatformPost{
    {
        super.api="/platform/supplierMgr/updateSupplier"
        super.params = ["id","name","supplierIntroduce","contacts","legalPersonName","legalPersonPhone","phone","email",
        "address","addressDetail","remark","updateBy","gmtModified"]
    }

    UpdateSupplier invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    UpdateSupplier preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    UpdateSupplier baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
