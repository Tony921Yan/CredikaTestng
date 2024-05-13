package com.credika.biz.request.http.platform.other


import com.miyuan.ifat.support.test.TestContext

class SelectionCategory extends com.credika.biz.request.http.platform.PlatformPost {
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
