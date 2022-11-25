package com.meiji.biz.request.http.mall.shopGoods

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class CheckSpusIsOnlyGift extends MallPost {
    {
        super.api = "shopGoods/checkSpusIsOnlyGift"
        super.params =  ["spuIds"]
    }

    CheckSpusIsOnlyGift invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    CheckSpusIsOnlyGift preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    CheckSpusIsOnlyGift baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
