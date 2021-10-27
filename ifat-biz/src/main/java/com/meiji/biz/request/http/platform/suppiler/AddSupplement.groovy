package com.meiji.biz.request.http.platform.suppiler

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class AddSupplement extends PlatformPost{
    {
        super.api="/platform/supplierMgr/addSupplement"
        super.params = ["supplierId","supplierCode","qualifications","businessAdditionPics",
        "businessAdditionDesc","createBy","updateBy","gmtCreate","gmtModified"]
    }

    AddSupplement invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    AddSupplement preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    AddSupplement baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
