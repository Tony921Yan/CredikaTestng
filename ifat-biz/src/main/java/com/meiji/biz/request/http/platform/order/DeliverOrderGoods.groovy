package com.meiji.biz.request.http.platform.order

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class DeliverOrderGoods extends PlatformPost {
    {
        super.api = "/platform/orderMgr/deliverOrderGoods"
        super.params =  [ "goodsList","logisticsCode","logisticsCompanyName","orderCode"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
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
