package com.meiji.biz.request.http.testInterface.cps


import com.miyuan.ifat.support.test.TestContext

class GetSpecialAreaGoods extends CpsPost {
    {
        super.api = "/thirdparty/api/cps/getSpecialAreaGoods"
        super.params =  ["categoryType","cpsCategoryId","page","rows"]
    }

    GetSpecialAreaGoods invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetSpecialAreaGoods preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetSpecialAreaGoods baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
