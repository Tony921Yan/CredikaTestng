package com.credika.biz.request.http.platform.goods

import com.credika.biz.request.http.platform.PlatformPost
import com.credika.biz.service.MysqlService
import com.miyuan.ifat.support.test.TestContext

class BatchRec extends PlatformPost {
    {
        super.api = "GoodsDetailManage/goodsMgrBatchRec"
        super.params =  ["spuId","updateById","updateByName"]
    }

    BatchRec invoke(TestContext testContext) {
        MysqlService.batechRec(testContext.get("spuId"))
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
