package com.meiji.biz.request.http.platform.order

import com.meiji.biz.request.http.platform.PlatformGet
import com.miyuan.ifat.support.test.TestContext

class GetOrderDetail extends PlatformGet {
    {
        super.api = "/platform/orderMgr/getOrderDetail"
        super.params =  [ "id"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    PlatformGet invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    PlatformGet preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    PlatformGet baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

}
