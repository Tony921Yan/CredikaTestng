package com.credika.biz.request.http.platform.suppiler


import com.miyuan.ifat.support.test.TestContext

class ElectronicContract extends com.credika.biz.request.http.platform.PlatformPost {
    {
        super.api = "ElectronicContract/queryPage"
        super.params =  [ "page","rows"]
    }

    ElectronicContract invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    ElectronicContract preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    ElectronicContract baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

    ElectronicContract specialAssert(TestContext testContext){
        Map apiResult = testContext.getResponse().data
        assert apiResult.total > 3
        return this
    }
}
