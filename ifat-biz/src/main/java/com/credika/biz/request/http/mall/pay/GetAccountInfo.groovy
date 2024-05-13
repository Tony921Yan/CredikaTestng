package com.credika.biz.request.http.mall.pay

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class GetAccountInfo extends MallPost {
    {
        super.api = "pay/getAccountInfo"
        super.params =  ["shopId"]
    }

    GetAccountInfo invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetAccountInfo preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetAccountInfo baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
