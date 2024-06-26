package com.credika.biz.request.http.platform.activeMainManage.marketAccount


import com.miyuan.ifat.support.test.TestContext

class QueryMarketAccountList extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api = "MarketCount/queryMarketAccountList"
       super.params = ["accountName","code","gmtCreateEnd","gmtCreateStart","page","rows"]
    }

    QueryMarketAccountList invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    QueryMarketAccountList preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    QueryMarketAccountList baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }


}
