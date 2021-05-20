package com.meiji.biz.request.http.platform.other

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class StartTask extends PlatformPost {
    {
        super.api = "/platform/excelMgr/startTask"
        super.params =  [ "taskId"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
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
}
