package com.meiji.biz.request.http.platform.goods

import com.meiji.biz.request.http.platform.PlatformPost
import com.meiji.biz.service.MysqlService
import com.miyuan.ifat.support.test.TestContext

class BatchRealDelete extends PlatformPost {
    {
        super.api = "GoodsDetailManage/goodsMgrBatchRealDelete"
        super.params =  ["spuId","updateById","updateByName"]
    }

    BatchRealDelete invoke(TestContext testContext) {
        MysqlService.batchrealDelete(testContext.get("spuId"))
        super.invoke(testContext)
        return this
    }

    BatchRealDelete preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    BatchRealDelete baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
