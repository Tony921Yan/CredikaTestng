package com.meiji.biz.request.http.platform.goods

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class PublishGoods extends PlatformPost{
    {
        super.api = "/platform/goodsMgr/publishGoods"
        super.params = ["spuId","updateById","updateByName"]
    }

    PublishGoods invoke(TestContext testContext) {
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
