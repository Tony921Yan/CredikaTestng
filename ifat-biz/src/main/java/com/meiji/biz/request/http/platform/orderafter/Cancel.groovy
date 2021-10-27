package com.meiji.biz.request.http.platform.orderafter

import com.meiji.biz.request.http.platform.PlatformGet
import com.miyuan.ifat.support.test.TestContext

class Cancel extends PlatformGet {
    {
        super.api = "/platform/orderMgr/cancel?orderAfterCode=R2021033110280305195"
        super.params =  []
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    Cancel invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    Cancel preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    Cancel baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
