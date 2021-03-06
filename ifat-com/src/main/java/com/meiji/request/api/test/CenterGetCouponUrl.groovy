package com.meiji.request.api.test

import com.meiji.com.TestContext
import com.meiji.request.http.MeijiRequest


class CenterGetCouponUrl extends MeijiRequest {
    {
        super.api = "/platform/brandMgr/brandDetail"
        super.params =  [ "id"]
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

    MeijiRequest specialAssert(TestContext testContext){

    }
}
