package com.meiji.biz.request.http.testInterface.cps


import com.miyuan.ifat.support.test.TestContext

class GetGoodsByName extends CpsPost {
    {
        super.api = "/thirdparty/api/cps/getGoodsByName"
        super.params =  ["commissionMoneySort","comprehensiveSort","page","priceSort","rows","salesSort","searchText"]
    }

    GetGoodsByName invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetGoodsByName preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetGoodsByName baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
