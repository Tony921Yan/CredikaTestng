package com.credika.biz.request.http.platform.orderDetailManage


import com.miyuan.ifat.support.test.TestContext

class DeliverOrderGoods extends com.credika.biz.request.http.platform.PlatformPost {
    {
        super.api = "OrderDetailManage/deliverOrderGoods"
        super.params =  [ "goodsList","logisticsCode","logisticsCompanyName","orderCode"]
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
        assert testContext.getResponse().code == 10
        return this
    }

}
