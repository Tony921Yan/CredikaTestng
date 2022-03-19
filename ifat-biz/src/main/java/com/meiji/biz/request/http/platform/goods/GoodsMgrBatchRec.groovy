package com.meiji.biz.request.http.platform.goods

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

/**
 * @author Remy*
 * @date 2022/03/17 18:48
 * @Vession update from history version
 * */
class GoodsMgrBatchRec extends PlatformPost{
    {
        super.api = "GoodsDetailManage/goodsMgrBatchRec"
        super.params = ["spuId"]
        super.preInvoke = "com.meiji.biz.request.http.platform.goods.BatchDelete"
    }

    GoodsMgrBatchRec invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    GoodsMgrBatchRec baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
