package com.credika.biz.request.http.platform.orderDetailManage


import com.miyuan.ifat.support.test.TestContext

class GetOrderByPage extends com.credika.biz.request.http.platform.PlatformPost {
    {
        super.api = "OrderDetailManage/getOrderByPage"
        super.params =  [ "condition","order","page","rows","sort"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }
    GetOrderByPage invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }
    GetOrderByPage preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }
    GetOrderByPage baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
