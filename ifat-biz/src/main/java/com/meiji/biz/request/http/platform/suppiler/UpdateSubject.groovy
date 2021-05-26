package com.meiji.biz.request.http.platform.suppiler

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class UpdateSubject extends PlatformPost{
    {
        super.api="/platform/supplierMgr/updateSubject"
        super.params = ["id","cardType","merchantShortname","businessLicenseCopy","businessLicenseNumber",
        "merchantName","businessTime","companyAddress","legalPerson","organizationCopy","organizationNumber","organizationTime",
        "updateBy","gmtModified"]
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
