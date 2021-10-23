package com.meiji.biz.request.http.testInterface.cps


import com.miyuan.ifat.support.test.TestContext

class GetGoodsByName extends CpsPost {
    {
        super.api = "/thirdparty/api/cps/getGoodsByName"
        super.params =  ["commissionMoneySort","comprehensiveSort","page","priceSort","rows","salesSort","searchText"]
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
