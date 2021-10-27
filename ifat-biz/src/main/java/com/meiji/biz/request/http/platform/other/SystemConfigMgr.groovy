package com.meiji.biz.request.http.platform.other

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class SystemConfigMgr extends PlatformPost {
    {
        super.api = "SystemConfigMgr/getConfigValue"
        super.params =  [ "dealerTutorQrCode"]
    }

    SystemConfigMgr invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    SystemConfigMgr preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    SystemConfigMgr baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
