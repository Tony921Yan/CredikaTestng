package com.credika.biz.request.http.platform.live
import com.credika.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class PageRole extends PlatformPost{
    {
        super.api="/Platform/pageRole"
        super.params = ["condition","page","rows"]
    }

    PageRole invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    PageRole preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    PageRole baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    PageRole specialAssert(TestContext testContext){
        Map apiResult = testContext.getResponse().data
        System.out.println("apiResult"+apiResult.total)
        assert apiResult.total > 10
        return this
    }

}
