package com.credika.biz.request.http.platform.integral


import com.miyuan.ifat.support.test.TestContext

class SignGiftReceiveByPage extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api="/IntegralList/signGiftReceiveByPage"
        super.params = ["condition","page","rows"]
    }

    SignGiftReceiveByPage invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    SignGiftReceiveByPage preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    SignGiftReceiveByPage baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    SignGiftReceiveByPage specialAssert(TestContext testContext){
        Map apiResult = testContext.getResponse().data
        System.out.println("apiResult"+apiResult)
        assert apiResult.total > 0
        return this
    }

}