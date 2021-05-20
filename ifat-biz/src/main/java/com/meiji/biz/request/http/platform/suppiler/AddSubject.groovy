package com.meiji.biz.request.http.platform.suppiler

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class AddSubject extends PlatformPost{
    {
        super.api="/platform/supplierMgr/addSubject"
        super.params = ["supplierId","supplierCode","cardType","merchantShortname","businessLicenseCopy","businessLicenseNumber",
        "merchantName","companyAddress","legalPerson","organizationCopy","organizationNumber","organizationTime","createBy",
        "updateBy","gmtCreate","gmtModified"]
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
