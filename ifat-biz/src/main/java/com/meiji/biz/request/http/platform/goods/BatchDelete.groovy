package com.meiji.biz.request.http.platform.goods

import com.meiji.biz.request.http.platform.PlatformPost
import com.meiji.biz.service.MysqlService
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext

class BatchDelete extends PlatformPost {
    {
        super.api = "GoodsDetailManage/goodsMgrBatchDelete"
        super.params =  ["spuId","updateById","updateByName"]
    }

    BatchDelete invoke(TestContext testContext) {
        MysqlService.batchDelete(testContext.get("spuId"))
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

    BatchDelete afterInvoke(TestContext testContext){
        testContext.get("spuId")
    }

}
