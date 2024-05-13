package com.credika.biz.request.http.mall.pay


import com.miyuan.ifat.support.test.TestContext

class FlowTotalData extends com.credika.biz.request.http.shop.ShopPost {
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
