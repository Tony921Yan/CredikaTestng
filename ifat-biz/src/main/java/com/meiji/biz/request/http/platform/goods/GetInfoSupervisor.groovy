package com.meiji.biz.request.http.platform.goods

import com.meiji.biz.request.http.platform.PlatformGet
import com.miyuan.ifat.support.test.TestContext

class GetInfoSupervisor extends PlatformGet{
    {
        super.api = "/platform/goodsMgr/getInfoSupervisor"
        super.params = ["id"]
    }

    GetInfoSupervisor invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetInfoSupervisor preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetInfoSupervisor baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
