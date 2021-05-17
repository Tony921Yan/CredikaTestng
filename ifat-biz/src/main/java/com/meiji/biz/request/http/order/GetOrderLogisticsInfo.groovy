package com.meiji.biz.request.http.order

import com.miyuan.ifat.support.test.TestContext
import com.meiji.biz.request.http.MeijiGet

class GetOrderLogisticsInfo extends MeijiGet {
    {
        super.api = "/platform/orderMgr/getOrderLogisticsInfo"
        super.params =  ["orderCode"]
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
