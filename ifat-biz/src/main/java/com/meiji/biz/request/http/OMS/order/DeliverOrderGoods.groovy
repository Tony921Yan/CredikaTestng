package com.meiji.biz.request.http.OMS.order

import com.meiji.biz.request.http.OMS.OMSPost
import com.miyuan.ifat.support.test.TestContext

class DeliverOrderGoods extends OMSPost {
    {
        super.api = "/api/supplier/orderMgr/deliverOrderGoods"
        super.params =  ["goodsList", "logisticsCode","logisticsCompanyName","orderCode","supplierId"]

    }

    DeliverOrderGoods invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    DeliverOrderGoods preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    DeliverOrderGoods baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
