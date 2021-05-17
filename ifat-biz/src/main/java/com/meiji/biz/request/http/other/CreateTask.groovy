package com.meiji.biz.request.http.other

import com.miyuan.ifat.support.test.TestContext
import com.meiji.biz.request.http.MeijiRequest

class CreateTask extends MeijiRequest {
    {
        super.api = "/platform/excelMgr/createTask"
        super.params =  [ "excelRows","fileName","fileUrl","id","taskType","uploadUser","uploadUserId"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
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
}
