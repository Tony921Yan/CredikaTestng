package com.meiji.request.http.shop

import com.meiji.com.TestContext
import com.meiji.request.http.MeijiGet

class GetAfterOrderDetail extends MeijiGet {
    {
        super.api = "/shop/order/getAfterOrderDetail?afterCode=R2021040211380581695"
        super.params =  []
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    MeijiGet invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    MeijiGet preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    MeijiGet baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

}
