package com.credika.biz.request.http.platform.orderDetailManage


import com.miyuan.ifat.support.test.TestContext

class GetOrderAfterSale extends com.credika.biz.request.http.platform.PlatformPost {
    {
        super.api = "OrderDetailManage/getOrderAfterSale"
        super.params =  ["orderCode"]
    }

    GetOrderAfterSale invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetOrderAfterSale preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetOrderAfterSale baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
