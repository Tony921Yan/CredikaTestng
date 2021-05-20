package com.meiji.biz.request.http.platform.brand

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class CreateBrand extends PlatformPost{
    {
        super.api="/platform/brandMgr/createBrand"
        super.params = ["createBy","gmtCreate","gmtModified","icon","id","name","remark","sort","updateBy"]
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

    PlatformPost specialAssert(TestContext testContext){

    }

}
