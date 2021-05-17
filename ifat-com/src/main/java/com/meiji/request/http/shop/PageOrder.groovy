package com.meiji.request.http.shop

import com.meiji.com.TestContext
import com.meiji.request.http.MeijiRequest

class PageOrder extends MeijiRequest {
    {
        super.api = "/shop/order/query/pageOrder"
        super.params =  [ "limit","page","queryStrings","shopId","status"]
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
