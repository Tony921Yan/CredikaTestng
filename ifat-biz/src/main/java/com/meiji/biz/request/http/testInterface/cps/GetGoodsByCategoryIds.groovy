package com.meiji.biz.request.http.testInterface.cps


import com.miyuan.ifat.support.test.TestContext

class GetGoodsByCategoryIds extends CpsPost {
    {
        super.api = "/thirdparty/api/cps/getGoodsByCategoryIds"
        super.params =  ["categoryIds","page","rows"]
    }

    GetGoodsByCategoryIds invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetGoodsByCategoryIds preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetGoodsByCategoryIds baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
