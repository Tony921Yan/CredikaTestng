package com.meiji.biz.request.http.platform.suppiler

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class AddSupplement extends PlatformPost{
    {
        super.api="/platform/supplierMgr/addSupplement"
        super.params = ["supplierId","supplierCode","qualifications","businessAdditionPics",
        "businessAdditionDesc","createBy","updateBy","gmtCreate","gmtModified"]
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
