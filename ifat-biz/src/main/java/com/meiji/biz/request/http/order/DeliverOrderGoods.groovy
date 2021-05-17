package com.meiji.biz.request.http.order

import com.miyuan.ifat.support.test.TestContext
import com.meiji.biz.request.http.MeijiRequest

class DeliverOrderGoods extends MeijiRequest {
    {
        super.api = "/platform/orderMgr/deliverOrderGoods"
        super.params =  [ "goodsList","logisticsCode","logisticsCompanyName","orderCode"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    MeijiRequest invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    MeijiRequest preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    MeijiRequest baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

}
