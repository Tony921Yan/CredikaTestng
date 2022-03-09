package com.meiji.biz.request.http.mall.pay

import com.meiji.biz.request.http.shop.ShopPost
import com.miyuan.ifat.support.test.TestContext

class FlowTotalData extends ShopPost {
    {
        super.api = "pay/flowTotalData"
        super.params =  ["month","shopId","tradeType","year"]
    }

    FlowTotalData invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    FlowTotalData preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    FlowTotalData baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
