package com.meiji.biz.request.http.platform.orderafter

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class CheckGoods extends PlatformPost {
    {
        super.api = "/platform/orderMgr/checkGoods"
        super.params =  [ "orderAfterCode","logisticsCode","logisticsCompanyName"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    CheckGoods invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    CheckGoods preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    CheckGoods baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
