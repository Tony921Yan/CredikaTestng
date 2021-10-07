package com.meiji.biz.request.http.mall.orderInfo

import com.meiji.biz.request.http.shop.ShopPost
import com.miyuan.ifat.support.test.TestContext

class FlowPageQuery extends ShopPost {
    {
        super.api = "pay/flowPageQuery"
        super.params =  ["condition","page","rows"]
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