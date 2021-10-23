package com.meiji.biz.request.http.thirdparty.cps


import com.miyuan.ifat.support.test.TestContext

class GetShareUrl extends CpsPost{
    {
        super.api = "/thirdparty/api/cps/getShareUrl"
        super.params =  ["bizType","channel","distributorId","platform","spuId"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
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
