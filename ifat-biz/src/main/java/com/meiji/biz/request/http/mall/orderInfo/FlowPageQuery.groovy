package com.meiji.biz.request.http.mall.orderInfo

import com.meiji.biz.request.http.shop.ShopPost
import com.miyuan.ifat.support.test.TestContext

class FlowPageQuery extends ShopPost {
    {
        super.api = "pay/flowPageQuery"
        super.params =  ["condition","page","rows"]
    }

    FlowPageQuery invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    FlowPageQuery preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    FlowPageQuery baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
