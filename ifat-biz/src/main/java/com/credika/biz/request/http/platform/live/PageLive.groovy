package com.credika.biz.request.http.platform.live
import com.credika.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class PageLive extends PlatformPost{
    {
        super.api="/Platform/pageLive"
        super.params = ["condition","page","rows"]
    }

    PageLive invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    PageLive preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    PageLive baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    PageLive specialAssert(TestContext testContext){
        Map apiResult = testContext.getResponse().data
        System.out.println("apiResult"+apiResult.total)
        assert apiResult.total > 10
        return this
    }

}
