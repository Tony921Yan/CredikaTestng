package com.meiji.request.http.suppiler

import com.meiji.com.TestContext
import com.meiji.request.http.MeijiRequest

class UdateSupplier extends MeijiRequest{
    {
        super.api="/platform/supplierMgr/updateSupplier"
        super.params = ["id","name","contacts","phone","legalPersonPhone","email","address","addressDetail","remark",
        "updateBy","gmtModified"]
    }

    MeijiRequest invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    MeijiRequest preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    MeijiRequest baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

}
