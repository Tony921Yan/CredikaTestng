package com.meiji.biz.request.http.testInterface.cps


import com.miyuan.ifat.support.test.TestContext

class GetGoodsByCategoryIds extends CpsPost {
    {
        super.api = "/thirdparty/api/cps/getGoodsByCategoryIds"
        super.params =  ["categoryIds","page","rows"]
    }

    CpsPost invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    CpsPost preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    CpsPost baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

}
