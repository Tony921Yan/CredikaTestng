package com.credika.biz.request.http.platform.suppiler


import com.miyuan.ifat.support.test.TestContext

class AddSupplierAddress extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api="/SupplierManage/addSupplierAddress"
        super.params = ["supplierId","contactsAddress","contactsAddressDetail","contactsName","contactsPhone","supplierCode"]
    }

    AddSupplierAddress invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    AddSupplierAddress preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    AddSupplierAddress baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
