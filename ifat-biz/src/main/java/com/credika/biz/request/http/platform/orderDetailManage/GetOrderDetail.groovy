package com.credika.biz.request.http.platform.orderDetailManage


import com.miyuan.ifat.support.test.TestContext

class GetOrderDetail extends com.credika.biz.request.http.platform.PlatformPost {
    {
        super.api = "OrderDetailManage/getOrderDetail"
        super.params =  [ "id"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    GetOrderDetail invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetOrderDetail preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetOrderDetail baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
