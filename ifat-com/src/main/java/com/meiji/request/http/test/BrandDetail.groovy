package com.meiji.request.http.test

import com.meiji.com.TestContext
import com.meiji.factory.MeijiRequest


class BrandDetail extends MeijiRequest {
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
