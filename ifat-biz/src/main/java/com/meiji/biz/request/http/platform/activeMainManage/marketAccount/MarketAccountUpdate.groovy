package com.meiji.biz.request.http.platform.activeMainManage.marketAccount

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class MarketAccountUpdate extends PlatformPost{
    {
        super.api = "MarketCount/update"
       super.params = ["accountAmount","accountName","id","operators","remark","accountId"]
    }

    MarketAccountUpdate invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    MarketAccountUpdate preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    MarketAccountUpdate baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }


}
