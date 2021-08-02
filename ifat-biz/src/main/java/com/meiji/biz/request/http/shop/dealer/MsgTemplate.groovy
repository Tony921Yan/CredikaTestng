package com.meiji.biz.request.http.shop.dealer

import com.meiji.biz.request.http.shop.ShopGet
import com.meiji.biz.request.http.shop.ShopPost
import com.miyuan.ifat.support.test.TestContext

class MsgTemplate extends ShopPost {
    {
        super.api = "dealer/msgTemplate"
        super.params =  [ "list"]
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
