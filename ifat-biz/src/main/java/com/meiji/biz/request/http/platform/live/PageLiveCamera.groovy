package com.meiji.biz.request.http.platform.live
import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class PageLiveCamera extends PlatformPost{
    {
        super.api="/Platform/pageLiveCamera"
        super.params = ["condition","page","rows"]
    }

    PageLiveCamera invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    PageLiveCamera preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    PageLiveCamera baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    PageLiveCamera specialAssert(TestContext testContext){
        Map apiResult = testContext.getResponse().data
        System.out.println("apiResult"+apiResult.total)
        assert apiResult.total > 10
        return this
    }

}
