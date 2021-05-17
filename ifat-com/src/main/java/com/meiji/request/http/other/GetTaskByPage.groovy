package com.meiji.request.http.other

import com.meiji.com.TestContext
import com.meiji.request.http.MeijiRequest

class GetTaskByPage extends MeijiRequest {
    {
        super.api = "/platform/excelMgr/getTaskByPage"
        super.params =  [ "condition","order","page","rows","sort"]
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
