package com.meiji.biz.request.http.platform.goods

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class AssetsManagement extends PlatformPost{
    {
        super.api = "AssetsManagement/getGoodsByPage"
        super.params = ["page","rows","sort","condition"]
    }

    AssetsManagement invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    AssetsManagement preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    AssetsManagement baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    AssetsManagement specialAssert(TestContext testContext){
        Map apiResult = testContext.getResponse().data
        assert apiResult.total > 20
        return this
    }
}
