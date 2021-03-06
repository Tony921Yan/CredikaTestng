package com.meiji.request.http.brand

import com.meiji.com.TestContext
import com.meiji.factory.MeijiRequest

class CreateBrand extends MeijiRequest{
    {
        super.api="/platform/brandMgr/createBrand"
        super.params = [["createBy","gmtCreate","gmtModified","icon","id","name","remark","sort","updateBy"]]
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
