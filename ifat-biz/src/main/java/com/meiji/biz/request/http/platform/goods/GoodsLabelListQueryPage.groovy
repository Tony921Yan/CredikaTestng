package com.meiji.biz.request.http.platform.goods

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class GoodsLabelListQueryPage extends PlatformPost{
    {
        super.api = "goodsLabelList/queryPage"
        super.params = ["labelsType","pageNum","pageSize"]
    }

    GoodsLabelListQueryPage invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GoodsLabelListQueryPage preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GoodsLabelListQueryPage baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
