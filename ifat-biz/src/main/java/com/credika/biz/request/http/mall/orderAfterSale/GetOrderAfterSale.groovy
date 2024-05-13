package com.credika.biz.request.http.mall.orderAfterSale

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class GetOrderAfterSale extends MallPost {
    {
        super.api = "/orderAfterSale/getOrderAfterSale"
        super.params =  ["afterCode","shopId"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    GetOrderAfterSale invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetOrderAfterSale preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetOrderAfterSale baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
