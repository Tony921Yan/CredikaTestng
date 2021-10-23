package com.meiji.biz.request.http.testInterface.cps


import com.miyuan.ifat.support.test.TestContext

class GetSpecialAreaGoods extends CpsPost {
    {
        super.api = "/thirdparty/api/cps/getSpecialAreaGoods"
        super.params =  ["categoryType","cpsCategoryId","page","rows"]
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
