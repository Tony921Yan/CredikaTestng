package com.credika.biz.request.http.platform.orderDetailManage


import com.miyuan.ifat.support.test.TestContext

class CancelOrder extends com.credika.biz.request.http.platform.PlatformPost {
    {
        super.api = "OrderDetailManage/cancelOrder"
        super.params =  ["id"]
    }

    CancelOrder invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    CancelOrder preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    CancelOrder baseAssert(TestContext testContext){
        assert testContext.getResponse().code == 10
        return this
    }

}
