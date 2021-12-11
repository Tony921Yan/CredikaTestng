package com.meiji.biz.request.http.platform.goods

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class BatchDelete extends PlatformPost {
    {
        super.api = "GoodsDetailManage/goodsMgrBatchDelete"
        super.params =  ["spuId","updateById","updateByName"]
    }

    BatchDelete invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    BatchDelete preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    BatchDelete baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
