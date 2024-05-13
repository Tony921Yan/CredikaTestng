package com.credika.biz.request.http.platform.other


import com.miyuan.ifat.support.test.TestContext

class GetTaskByPage extends com.credika.biz.request.http.platform.PlatformPost {
    {
        super.api = "/platform/excelMgr/getTaskByPage"
        super.params =  [ "condition","order","page","rows","sort"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    GetTaskByPage invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetTaskByPage preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetTaskByPage baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
