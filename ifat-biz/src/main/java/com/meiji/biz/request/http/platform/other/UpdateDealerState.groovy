package com.meiji.biz.request.http.platform.other

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class UpdateDealerState extends PlatformPost {
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
