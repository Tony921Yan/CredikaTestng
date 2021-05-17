package com.meiji.biz.request.http.orderafter

import com.miyuan.ifat.support.test.TestContext
import com.meiji.biz.request.http.MeijiRequest

class CheckGoods extends MeijiRequest {
    {
        super.api = "/platform/orderMgr/checkGoods"
        super.params =  [ "orderAfterCode","logisticsCode","logisticsCompanyName"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    MeijiRequest invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    MeijiRequest preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    MeijiRequest baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

}
