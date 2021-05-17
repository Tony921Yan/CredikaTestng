package com.meiji.request.http.suppiler

import com.meiji.com.TestContext
import com.meiji.request.http.MeijiRequest

class AddSubject extends MeijiRequest{
    {
        super.api="/platform/supplierMgr/addSubject"
        super.params = ["supplierId","supplierCode","cardType","merchantShortname","businessLicenseCopy","businessLicenseNumber",
        "merchantName","companyAddress","legalPerson","organizationCopy","organizationNumber","organizationTime","createBy",
        "updateBy","gmtCreate","gmtModified"]
    }

    MeijiRequest invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    MeijiRequest preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    MeijiRequest baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

}
