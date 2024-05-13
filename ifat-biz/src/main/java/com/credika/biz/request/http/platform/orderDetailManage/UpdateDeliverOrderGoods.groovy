package com.credika.biz.request.http.platform.orderDetailManage


import com.miyuan.ifat.support.test.TestContext

class UpdateDeliverOrderGoods extends com.credika.biz.request.http.platform.PlatformPost {
    {
        super.api = "OrderDetailManage/updateDeliverOrderGoods"
        super.params =  [ "id","logisticsCode","logisticsCompanyName","orderCode"]
    }
    UpdateDeliverOrderGoods invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }
    UpdateDeliverOrderGoods preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }
    UpdateDeliverOrderGoods baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
