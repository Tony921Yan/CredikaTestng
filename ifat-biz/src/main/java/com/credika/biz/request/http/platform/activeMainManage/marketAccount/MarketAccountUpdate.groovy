package com.credika.biz.request.http.platform.activeMainManage.marketAccount


import com.miyuan.ifat.support.test.TestContext

class MarketAccountUpdate extends com.credika.biz.request.http.platform.PlatformPost{
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
