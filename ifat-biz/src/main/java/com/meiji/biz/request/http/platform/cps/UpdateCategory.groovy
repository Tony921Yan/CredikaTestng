package com.meiji.biz.request.http.platform.cps

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class UpdateCategory extends PlatformPost {
    {
        super.api = "CostPerSalesCategory/updateCategory"
        super.params =  ["id","name","status","remark","categoryType","subtitle"]
    }

    UpdateCategory invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    UpdateCategory preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    UpdateCategory baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
