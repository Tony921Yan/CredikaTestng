package com.credika.biz.request.http.platform.goods

import com.credika.biz.request.http.platform.PlatformPost
import com.credika.biz.service.MysqlService
import com.miyuan.ifat.support.test.TestContext

class PublishGoods extends PlatformPost{
    {
        super.api = "GoodsDetailManage/publishGoods"
        super.params = ["spuId","updateById","updateByName"]
    }

    PublishGoods invoke(TestContext testContext) {
        MysqlService.publishBack(testContext.get("spuId"))
        super.invoke(testContext)
        return this
    }

    PublishGoods preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    PublishGoods baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
