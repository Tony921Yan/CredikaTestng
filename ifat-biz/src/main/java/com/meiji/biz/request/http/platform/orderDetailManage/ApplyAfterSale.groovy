package com.meiji.biz.request.http.platform.orderDetailManage

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class ApplyAfterSale extends PlatformPost {
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
