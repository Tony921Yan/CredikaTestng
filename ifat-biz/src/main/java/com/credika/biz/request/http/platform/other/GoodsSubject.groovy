package com.credika.biz.request.http.platform.other


import com.miyuan.ifat.support.test.TestContext

class GoodsSubject extends com.credika.biz.request.http.platform.PlatformPost {
    {
        super.api = "GoodsSubject/queryPage"
        super.params =  [ "page","rows"]
    }

    GoodsSubject invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GoodsSubject preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GoodsSubject baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    GoodsSubject specicalAssert(TestContext testContext){
        Map apiResult = testContext.getResponse().data
        assert apiResult.total > 20
        return this
    }
}
