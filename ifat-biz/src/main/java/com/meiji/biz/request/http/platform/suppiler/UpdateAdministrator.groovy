package com.meiji.biz.request.http.platform.suppiler

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class UpdateAdministrator extends PlatformPost{
    {
        super.api="/platform/supplierMgr/updateAdministrator"
        super.params = ["id","contactType","contactName","contactIdCardNumber","mobilePhone",
                        "contactEmail","updateBy","gmtModified"]
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
