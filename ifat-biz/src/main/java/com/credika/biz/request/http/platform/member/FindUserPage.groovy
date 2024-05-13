package com.credika.biz.request.http.platform.member


import com.miyuan.ifat.support.test.TestContext

class FindUserPage extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api="/Memeber/findUserPage"
        super.params = ["condition","page","rows"]
    }

    FindUserPage invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    FindUserPage preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    FindUserPage baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
    FindUserPage specialAssert(TestContext testContext){
        Map apiResult = testContext.getResponse().data
        System.out.println("apiResul"+apiResult.total)
        assert apiResult.total >20
        return this
    }

}
