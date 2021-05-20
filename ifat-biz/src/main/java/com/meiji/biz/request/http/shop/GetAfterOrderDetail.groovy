package com.meiji.biz.request.http.shop

import com.miyuan.ifat.support.test.TestContext

class GetAfterOrderDetail extends ShopGet {
    {
        super.api = "/shop/order/getAfterOrderDetail?afterCode=R2021040211380581695"
        super.params =  []
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    ShopGet invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    ShopGet preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    ShopGet baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

}
