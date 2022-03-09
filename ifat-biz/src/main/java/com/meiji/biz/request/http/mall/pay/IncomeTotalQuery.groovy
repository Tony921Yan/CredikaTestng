package com.meiji.biz.request.http.mall.pay

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class IncomeTotalQuery extends MallPost {
    {
        super.api = "pay/incomeTotalQuery"
        super.params =  ["type","shopId"]
    }

    IncomeTotalQuery invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    IncomeTotalQuery baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
