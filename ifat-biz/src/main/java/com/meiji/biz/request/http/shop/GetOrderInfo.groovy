package com.meiji.biz.request.http.shop

import com.miyuan.ifat.support.test.TestContext

class GetOrderInfo extends ShopPost {
    {
        super.api = "/shop/order/query/getOrderInfo"
        super.params =  [ "orderCode"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    ShopPost invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    ShopPost preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    ShopPost baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }
}
