package com.credika.biz.request.http.platform.member


import com.miyuan.ifat.support.test.TestContext

class FindUserLogInfo extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api="/Memeber/findUserLogInfo"
        super.params = ["condition","page","rows"]
    }

    FindUserLogInfo invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    FindUserLogInfo preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    FindUserLogInfo baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
   FindUserLogInfo specialAssert(TestContext testContext){
        Map apiResult = testContext.getResponse().data
        System.out.println("apiResult"+apiResult)
        assert apiResult.total > 10
   }

}
