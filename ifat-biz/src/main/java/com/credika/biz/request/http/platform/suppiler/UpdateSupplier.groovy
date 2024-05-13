package com.credika.biz.request.http.platform.suppiler


import com.miyuan.ifat.support.test.TestContext

class UpdateSupplier extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api="/SupplierManage/updateSupplier"
        super.params = ["id","name","contacts","phone","legalPersonPhone","email",
        "address","addressDetail","remark","legalPersonName","supplierIntroduce","supplierType","contractType","supervisorId","shouldModifyPhone","oldPhone","supplierLevel"]
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
