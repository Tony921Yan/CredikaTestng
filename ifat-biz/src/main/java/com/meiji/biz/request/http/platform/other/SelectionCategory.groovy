package com.meiji.biz.request.http.platform.other

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class SelectionCategory extends PlatformPost {
    {
        super.api = "SelectionCategory/queryPage"
        super.params =  []
    }

    SelectionCategory invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    SelectionCategory preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    SelectionCategory baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    SelectionCategory specicalAssert(TestContext testContext){
        Map apiResult = testContext.getResponse().data
        assert apiResult.total > 10
        return this
    }
}
