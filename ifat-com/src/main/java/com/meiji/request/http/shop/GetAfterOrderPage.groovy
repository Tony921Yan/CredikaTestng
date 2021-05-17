package com.meiji.request.http.shop

import com.meiji.com.TestContext
import com.meiji.request.http.MeijiRequest

class GetAfterOrderPage extends MeijiRequest {
    {
        super.api = "/shop/order/getAfterOrderPage"
        super.params =  [ "condition","order","page","rows","sort"]
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
