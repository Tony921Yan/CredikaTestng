package com.credika.biz.request.http.platform.orderDetailManage


import com.miyuan.ifat.support.test.TestContext

class ApplyAfterSale extends com.credika.biz.request.http.platform.PlatformPost {
    {
        super.api = "OrderDetailManage/applyAfterSale"
        super.params =  [ "afterType","goodsList","orderCode","refundAmount","userId","userName"]
    }
    ApplyAfterSale invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }
    ApplyAfterSale preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }
    ApplyAfterSale baseAssert(TestContext testContext){
        assert testContext.getResponse().code == 10
        return this
    }

}
