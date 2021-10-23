package com.meiji.biz.request.http.testInterface.cps


import com.miyuan.ifat.support.test.TestContext

class SearchCpsCategory extends CpsPost {
    {
        super.api = "/thirdparty/api/cps/searchCpsCategory"
        super.params =  ["userId"]
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
