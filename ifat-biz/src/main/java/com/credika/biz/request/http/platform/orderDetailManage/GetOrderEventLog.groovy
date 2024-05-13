package com.credika.biz.request.http.platform.orderDetailManage


import com.miyuan.ifat.support.test.TestContext

class GetOrderEventLog extends com.credika.biz.request.http.platform.PlatformPost {
    {
        super.api = "OrderDetailManage/getOrderEventLog"
        super.params =  ["orderCode"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    GetOrderEventLog invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetOrderEventLog preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetOrderEventLog baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
