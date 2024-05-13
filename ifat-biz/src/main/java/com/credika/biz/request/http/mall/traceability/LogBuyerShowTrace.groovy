package com.credika.biz.request.http.mall.traceability

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class LogBuyerShowTrace extends MallPost{
    {
        super.api = "traceability/logBuyerShowTrace"
        super.params = ["id","avatar","nickname","traceType","userId"]
    }

    LogBuyerShowTrace invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    LogBuyerShowTrace preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    LogBuyerShowTrace baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }


}
