package com.credika.biz.request.http.platform.suppiler


import com.miyuan.ifat.support.test.TestContext

class UpdateSupplement extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api="/platform/supplierMgr/updateSupplement"
        super.params = ["id","qualifications","businessAdditionPics",
        "businessAdditionDesc","updateBy","gmtModified"]
    }

    UpdateSupplement invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    UpdateSupplement preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    UpdateSupplement baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
