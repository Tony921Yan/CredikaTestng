package com.meiji.biz.request.http.platform.suppiler

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class UpdateLegal extends PlatformPost{
    {
        super.api="/platform/supplierMgr/updateLegal"
        super.params = ["id","idCardCopy","idCardNational","idCardName","idCardNumber",
        "idCardValidTime","updateBy","gmtModified"]
    }

    UpdateLegal invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    UpdateLegal preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    UpdateLegal baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
