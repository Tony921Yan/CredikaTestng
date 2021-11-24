package com.meiji.biz.request.http.platform.label

import com.meiji.biz.request.http.platform.PlatformGet
import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class GetLabel extends PlatformPost{
    {
        super.api="goodsLabelList/queryPage"
        super.params = ["pageNum","pageSize","labelName","id"]
    }

    GetLabel invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetLabel preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetLabel baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

    GetLabel specialAssert(TestContext testContext){
        Map apiResult = testContext.getResponse().data
        assert apiResult.total > 10
        return this
    }
}
