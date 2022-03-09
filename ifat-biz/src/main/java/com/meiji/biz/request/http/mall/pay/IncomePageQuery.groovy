package com.meiji.biz.request.http.mall.pay

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class IncomePageQuery extends MallPost {
    {
        super.api = "pay/incomePageQuery"
        super.params =  ["page","rows","condition"]
    }

    IncomePageQuery invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    IncomePageQuery preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    IncomePageQuery baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
