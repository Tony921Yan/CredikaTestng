package com.meiji.biz.request.http.shop

import com.miyuan.ifat.support.test.TestContext

class GetAfterLog extends ShopGet {
    {
        super.api = "/shop/order/getAfterLog"
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
