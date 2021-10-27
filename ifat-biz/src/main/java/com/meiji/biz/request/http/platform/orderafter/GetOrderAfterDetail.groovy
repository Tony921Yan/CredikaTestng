package com.meiji.biz.request.http.platform.orderafter

import com.meiji.biz.request.http.platform.PlatformGet
import com.miyuan.ifat.support.test.TestContext

class GetOrderAfterDetail extends PlatformGet {
    {
        super.api = "/platform/orderMgr/getOrderAfterDetail?orderAfterCode=R2021033110280305195"
        super.params =  []
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    GetOrderAfterDetail invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetOrderAfterDetail preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetOrderAfterDetail baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
