package com.credika.biz.request.http.platform.suppiler


import com.miyuan.ifat.support.test.TestContext

class UpdateSupplierAddress extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api="/SupplierManage/updateSupplierAddress"
        super.params = ["id","supplierId","contactsAddress","contactsAddressDetail","contactsName","contactsPhone","supplierCode","isDefault",
        "supplierId","updateBy"]
    }

    UpdateSupplierAddress invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    UpdateSupplierAddress preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    UpdateSupplierAddress baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return  this
    }

}
