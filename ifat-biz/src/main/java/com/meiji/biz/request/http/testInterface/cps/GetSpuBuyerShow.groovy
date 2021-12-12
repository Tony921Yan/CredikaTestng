package com.meiji.biz.request.http.testInterface.cps

import com.miyuan.ifat.support.test.TestContext

class GetSpuBuyerShow extends CpsPost {
    {
        super.api = "thirdparty/api/cps/getSpuBuyerShow"
        super.params =  ["channel","distributorId","platform","spuId"]
    }

    GetSpuBuyerShow invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetSpuBuyerShow preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetSpuBuyerShow baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
