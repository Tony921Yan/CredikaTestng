package com.credika.biz.request.http.platform.suppiler


import com.miyuan.ifat.support.test.TestContext

class AddSubject extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api="/SupplierManage/addSubject"
        super.params = ["supplierId","supplierCode","merchantShortname",
        "merchantName","legalPerson","organizationType"]
    }

    AddSubject invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    AddSubject preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    AddSubject baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
