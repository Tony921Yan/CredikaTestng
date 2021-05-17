package com.meiji.biz.request.http.brand

import com.miyuan.ifat.support.test.TestContext
import com.meiji.biz.request.http.MeijiRequest

class CreateBrand extends MeijiRequest{
    {
        super.api="/platform/brandMgr/createBrand"
        super.params = ["createBy","gmtCreate","gmtModified","icon","id","name","remark","sort","updateBy"]
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

    MeijiRequest specialAssert(TestContext testContext){

    }

}
