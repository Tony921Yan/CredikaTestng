package com.credika.biz.request.http.testInterface.cps


import com.miyuan.ifat.support.test.TestContext

class GetGoodsByIds extends CpsPost {
    {
        super.api = "/thirdparty/api/cps/getGoodsByIds"
        super.params =  ["spuIds"]
    }

    GetGoodsByIds invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetGoodsByIds preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetGoodsByIds baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
