package com.meiji.biz.request.http.platform.other

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class GetSearchKeys extends PlatformPost {
    {
        super.api = "SystemConfigMgr/getSearchKeys"
        super.params =  []
    }

    GetSearchKeys invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetSearchKeys preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetSearchKeys baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
