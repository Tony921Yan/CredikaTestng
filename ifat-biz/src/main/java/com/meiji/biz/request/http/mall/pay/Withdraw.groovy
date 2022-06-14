package com.meiji.biz.request.http.mall.pay

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class Withdraw extends MallPost {
    {
        super.api = "pay/withdraw"
        super.params =  ["shopId","amount","remark"]
    }

    Withdraw invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    Withdraw preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    Withdraw baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
