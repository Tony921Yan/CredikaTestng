package com.meiji.biz.request.http.platform.live
import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class PageGoods extends PlatformPost{
    {
        super.api="/Platform/pageGoods"
        super.params = ["condition","page","rows"]
    }

    PageGoods invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    PageGoods preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    PageGoods baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    PageGoods specialAssert(TestContext testContext){
        Map apiResult = testContext.getResponse().data
        System.out.println("apiResult"+apiResult.total)
        assert apiResult.total > 10
        return this
    }

}
