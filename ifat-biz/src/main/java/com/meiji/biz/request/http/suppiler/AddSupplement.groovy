package com.meiji.biz.request.http.suppiler

import com.miyuan.ifat.support.test.TestContext
import com.meiji.biz.request.http.MeijiRequest

class AddSupplement extends MeijiRequest{
    {
        super.api="/platform/supplierMgr/addSupplement"
        super.params = ["supplierId","supplierCode","qualifications","businessAdditionPics",
        "businessAdditionDesc","createBy","updateBy","gmtCreate","gmtModified"]
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
