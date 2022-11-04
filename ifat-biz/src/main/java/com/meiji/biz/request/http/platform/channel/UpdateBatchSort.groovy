package com.meiji.biz.request.http.platform.channel
import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext
class UpdateBatchSort extends PlatformPost {
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
