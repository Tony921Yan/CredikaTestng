package com.meiji.biz.request.http.platform.other

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class QueryStockRecord extends PlatformPost {
    {
        super.api = "/platform/stock/queryStockRecord"
        super.params =  [ "condition","order","page","rows","sort"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    QueryStockRecord invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    QueryStockRecord preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    QueryStockRecord baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
