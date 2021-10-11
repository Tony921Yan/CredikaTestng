package com.meiji.biz.request.http.platform.other

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class ElectronicContractUpdate extends PlatformPost {
    {
        super.api = "/ElectronicContract/update"
        super.params =  ["id","contractName","contractNo","businessManager","supplierId","supplierName","supplierContacts","supplierMobile","mainCategories","renewCustomer","deposit","signDate","effectiveDate","expiringDate","contractUrl","remark","contractStatus"]
    }

    PlatformPost invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    PlatformPost preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    PlatformPost baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

}