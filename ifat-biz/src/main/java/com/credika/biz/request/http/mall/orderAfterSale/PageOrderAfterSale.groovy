package com.credika.biz.request.http.mall.orderAfterSale

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class PageOrderAfterSale extends MallPost {
    {
        super.api = "/orderAfterSale/pageOrderAfterSale"
        super.params =  ["limit","page","shopId"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    PageOrderAfterSale invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    PageOrderAfterSale preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    PageOrderAfterSale baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
