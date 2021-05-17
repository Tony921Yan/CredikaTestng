package com.meiji.biz.request.http.shop

import com.miyuan.ifat.support.test.TestContext
import com.meiji.biz.request.http.MeijiGet

class GetAfterLog extends MeijiGet {
    {
        super.api = "/shop/order/getAfterLog?afterCode=R2021040211380581695"
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
