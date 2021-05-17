package com.meiji.request.http.order

import com.meiji.com.TestContext
import com.meiji.request.http.MeijiGet

class CancelOrder extends MeijiGet {
    {
        super.api = "/platform/orderMgr/cancelOrder?id=4"
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
