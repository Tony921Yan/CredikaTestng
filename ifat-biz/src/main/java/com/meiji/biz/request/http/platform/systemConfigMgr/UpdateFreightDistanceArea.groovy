package com.meiji.biz.request.http.platform.systemConfigMgr

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class UpdateFreightDistanceArea extends PlatformPost {
    {
        super.api = "/SystemConfigMgr/updateFreightDistanceArea"
        super.params =  [ "params"]
    }

    UpdateFreightDistanceArea invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }
    UpdateFreightDistanceArea preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }
    UpdateFreightDistanceArea baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
