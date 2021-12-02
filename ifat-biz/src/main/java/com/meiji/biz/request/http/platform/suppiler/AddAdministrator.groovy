package com.meiji.biz.request.http.platform.suppiler

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class AddAdministrator extends PlatformPost{
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

    AddAdministrator invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    AddAdministrator preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    AddAdministrator baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
