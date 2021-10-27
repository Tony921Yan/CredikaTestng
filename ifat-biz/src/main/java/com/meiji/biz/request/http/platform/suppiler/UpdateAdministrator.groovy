package com.meiji.biz.request.http.platform.suppiler

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class UpdateAdministrator extends PlatformPost{
    {
        super.api="/SupplierManage/updateAdministrator"
        super.params = ["id","contactType","contactName","mobilePhone","contactIdCardNumber","contactEmail"]
    }

    UpdateAdministrator invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    UpdateAdministrator preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    UpdateAdministrator baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
