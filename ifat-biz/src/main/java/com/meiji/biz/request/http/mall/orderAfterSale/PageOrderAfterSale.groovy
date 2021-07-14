package com.meiji.biz.request.http.mall.orderAfterSale

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class PageOrderAfterSale extends MallPost {
    {
        super.api = "/orderAfterSale/pageOrderAfterSale"
        super.params =  ["limit","page","shopId"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
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
