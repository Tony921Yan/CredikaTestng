package com.meiji.biz.request.http.platform.suppiler

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class ElectronicContractUpdate extends PlatformPost {
    {
        super.api = "/ElectronicContract/update"
        super.params =  ["id","contractName","contractNo","businessManager","supplierId","supplierName","supplierContacts","supplierMobile","mainCategories","renewCustomer","deposit","signDate","effectiveDate","expiringDate","contractUrl","remark","contractStatus"]
    }

    ElectronicContractUpdate invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    ElectronicContractUpdate preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    ElectronicContractUpdate baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
