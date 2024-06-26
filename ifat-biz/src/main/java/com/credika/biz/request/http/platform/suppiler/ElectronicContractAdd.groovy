package com.credika.biz.request.http.platform.suppiler


import com.miyuan.ifat.support.test.TestContext

class ElectronicContractAdd extends com.credika.biz.request.http.platform.PlatformPost {
    {
        super.api = "/ElectronicContract/add"
        super.params =  ["contractName","contractNo","businessManager","supplierId","supplierName","supplierContacts","supplierMobile","mainCategories","renewCustomer","deposit","signDate","effectiveDate","expiringDate","contractUrl","contractStatus"]
    }

    ElectronicContractAdd invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    ElectronicContractAdd preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    ElectronicContractAdd baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
