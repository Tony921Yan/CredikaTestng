package com.credika.biz.request.http.platform.shopmanager


import com.miyuan.ifat.support.test.TestContext

class UpdateDealerState extends com.credika.biz.request.http.platform.PlatformPost {
    {
        super.api = "/platform/dealerMgr/updateDealerState"
        super.params =  [ "id","state"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    UpdateDealerState invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    UpdateDealerState preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    UpdateDealerState baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
