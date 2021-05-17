package com.meiji.request.http.orderafter

import com.meiji.com.TestContext
import com.meiji.request.http.MeijiGet
import com.meiji.request.http.MeijiRequest

class GetOrderAfterDetail extends MeijiGet {
    {
        super.api = "/platform/orderMgr/getOrderAfterDetail?orderAfterCode=R2021033110280305195"
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
