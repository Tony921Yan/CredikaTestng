package com.credika.biz.request.http.platform.goods

import com.credika.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class GoodsCopy extends PlatformPost {
    {
        super.api = "GoodsDetailManage/goodsCopy"
        super.params =  ["spuId","updateById","updateByName"]
    }

    GoodsCopy invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GoodsCopy preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GoodsCopy baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
