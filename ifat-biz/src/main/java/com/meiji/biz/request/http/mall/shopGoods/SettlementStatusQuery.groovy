package com.meiji.biz.request.http.mall.shopGoods

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class SettlementStatusQuery extends MallPost {
    {
        super.api = "shopGoods/settlementStatusQuery"
        super.params =  ["shopId"]
    }

    SettlementStatusQuery invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    SettlementStatusQuery preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    SettlementStatusQuery baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
