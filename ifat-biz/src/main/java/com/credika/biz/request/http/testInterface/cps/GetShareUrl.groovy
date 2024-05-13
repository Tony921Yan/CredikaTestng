package com.credika.biz.request.http.testInterface.cps


import com.miyuan.ifat.support.test.TestContext

class GetShareUrl extends CpsPost{
    {
        super.api = "/thirdparty/api/cps/getShareUrl"
        super.params =  ["bizType","channel","distributorId","platform","spuId"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    GetShareUrl invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetShareUrl preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetShareUrl baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
