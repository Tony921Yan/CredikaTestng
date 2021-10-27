package com.meiji.biz.request.http.platform.order

import com.meiji.biz.request.http.platform.PlatformGet
import com.miyuan.ifat.support.test.TestContext

class CancelOrder extends PlatformGet {
    {
        super.api = "/platform/orderMgr/cancelOrder?id=4"
        super.params =  []
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
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
        super.baseAssert(testContext)
        return this
    }

}
