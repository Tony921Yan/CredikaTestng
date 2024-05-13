package com.credika.biz.request.http.platform.suppiler


import com.miyuan.ifat.support.test.TestContext
class UpdateSubject extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api="/SupplierManage/updateSubject"
        super.params = ["id","supplierId","supplierCode","cardType","merchantShortname",
        "businessLicenseCopy","businessLicenseNumber","merchantName","merchantName","companyAddress","legalPerson","organizationTime",
        "organizationType"]
    }

    UpdateSubject invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    UpdateSubject preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    UpdateSubject baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
