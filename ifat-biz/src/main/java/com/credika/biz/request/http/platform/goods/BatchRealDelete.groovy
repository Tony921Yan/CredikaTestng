package com.credika.biz.request.http.platform.goods

import com.credika.biz.request.http.platform.PlatformPost
import com.credika.biz.service.MysqlService
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
