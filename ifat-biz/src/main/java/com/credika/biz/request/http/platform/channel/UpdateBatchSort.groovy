package com.credika.biz.request.http.platform.channel


import com.miyuan.ifat.support.test.TestContext
class UpdateBatchSort extends com.credika.biz.request.http.platform.PlatformPost {
    {
        super.api = "ShareOrderManage/updateBatchSort"
        super.params =  ["columnId","page","rows","sourceId","targetId"]
    }

    UpdateBatchSort invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    UpdateBatchSort preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    UpdateBatchSort baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
