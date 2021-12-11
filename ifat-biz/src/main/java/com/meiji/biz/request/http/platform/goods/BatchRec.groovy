package com.meiji.biz.request.http.platform.goods

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class BatchRec extends PlatformPost {
    {
        super.api = "GoodsDetailManage/goodsMgrBatchRec"
        super.params =  ["spuId","updateById","updateByName"]
    }

    BatchRec invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    BatchRec preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    BatchRec baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
