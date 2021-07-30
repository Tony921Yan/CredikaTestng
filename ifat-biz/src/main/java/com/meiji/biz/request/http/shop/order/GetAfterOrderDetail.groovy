package com.meiji.biz.request.http.shop.order

import com.meiji.biz.request.http.shop.ShopGet
import com.miyuan.ifat.support.test.TestContext

class GetAfterOrderDetail extends ShopGet {
    {
        super.api = "/shop/order/getAfterOrderDetail"
        super.params =  ["afterCode","shopId"]
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
