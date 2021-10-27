package com.meiji.biz.request.http.platform.other

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class StartTask extends PlatformPost {
    {
        super.api = "/platform/excelMgr/startTask"
        super.params =  [ "taskId"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    StartTask invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    StartTask preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    StartTask baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
