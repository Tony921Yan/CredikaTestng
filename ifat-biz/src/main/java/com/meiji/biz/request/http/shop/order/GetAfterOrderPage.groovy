package com.meiji.biz.request.http.shop.order

import com.meiji.biz.request.http.shop.ShopPost
import com.miyuan.ifat.support.test.TestContext

class GetAfterOrderPage extends ShopPost {
    {
        super.api = "/shop/order/getAfterOrderPage"
        super.params =  [ "condition","order","page","rows","sort"]
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
