package com.meiji.biz.request.http.platform.suppiler

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class AddSupplier extends PlatformPost{
    {
        super.api="SupplierManage/addSupplier"
        super.params = ["legalPersonName",
                        "legalPersonPhone",
                        "name",
                        "contacts",
                        "phone",
                        "email",
                        "address",
                        "addressDetail",
                        "contractType",
                        "supervisorId",
                        "contactsAddress",
                        "contactsAddressDetail",
                        "contactsName",
                        "contactsPhone",
                        "shipperPhone",
                        "shipperName",
                        "supplierType",
                        "shipperAddress",
                        "shipperAddressDetail",
                        "supplierLevel"]
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
