package com.meiji.biz.request.http.platform.marketingManagement

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class ActiveManage extends PlatformPost {
    {
        super.api = "ActiveManage/queryActiveByPage"
        super.params =  [ "pageNum","pageSize"]
    }

    ActiveManage invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    ActiveManage preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    ActiveManage baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

    ActiveManage specicalAssert(TestContext testContext){
        Map apiResult = testContext.getResponse().data
        assert apiResult.total > 20
        return this
    }
}
