package com.credika.biz.request.http.platform.goods

import com.credika.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class PublishBack extends PlatformPost{
    {
        super.api = "GoodsDetailManage/publishBack"
        super.params = ["spuId","updateById","updateByName"]
        preInvoke = "PublishGoods"
    }

    PublishBack invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    PublishBack preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    PublishBack baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
