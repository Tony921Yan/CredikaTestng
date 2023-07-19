package com.meiji.biz.request.http.platform.hfjy
import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class Page extends PlatformPost{
    {
        super.api="/platform/oilsUseOrder/page"
        super.params = ["condition","page","rows"]
    }

    Page invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    Page preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    Page baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}