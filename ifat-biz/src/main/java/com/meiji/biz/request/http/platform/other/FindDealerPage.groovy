package com.meiji.biz.request.http.platform.other

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class FindDealerPage extends PlatformPost {
    {
        super.api = "/platform/dealerMgr/findDealerPage"
        super.params =  [ "createTimeEnd","createTimeStart","dealerCode","nickname","page","phone","rows"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    FindDealerPage invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    FindDealerPage preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    FindDealerPage baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
