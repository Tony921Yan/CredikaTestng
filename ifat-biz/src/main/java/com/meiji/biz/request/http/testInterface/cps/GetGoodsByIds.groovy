package com.meiji.biz.request.http.testInterface.cps


import com.miyuan.ifat.support.test.TestContext

class GetGoodsByIds extends TestInterfacePost {
    {
        super.api = "/thirdparty/api/cps/getGoodsByIds"
        super.params =  ["spuIds"]
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
