package com.meiji.request.http.mall

import com.meiji.com.TestContext
import com.meiji.request.http.MeijiRequest

class ListOrderAfterLog extends MeijiRequest {
    {
        super.api = "/mall/orderAfterSale/listOrderAfterLog"
        super.params =  ["afterCode"]
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
