package com.meiji.biz.request.http.testInterface.cps


import com.miyuan.ifat.support.test.TestContext

class GetGoodsByCategoryIds extends TestInterfacePost {
    {
        super.api = "/thirdparty/api/cps/getGoodsByCategoryIds"
        super.params =  ["categoryIds","page","rows"]
    }

    TestInterfacePost invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    TestInterfacePost preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    TestInterfacePost baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

}
