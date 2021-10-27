package com.meiji.biz.request.http.platform.other

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class CreateTask extends PlatformPost {
    {
        super.api = "/platform/excelMgr/createTask"
        super.params =  [ "excelRows","fileName","fileUrl","id","taskType","uploadUser","uploadUserId"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    CreateTask invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    CreateTask preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    CreateTask baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
