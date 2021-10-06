package com.meiji.biz.request.http.shop.order

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class FlowTotalData extends MallPost {
    {
        super.api = "pay/flowTotalData"
        super.params =  ["month","shopId","tradeType","year"]
    }

    MallPost invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    MallPost preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    MallPost baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

}
