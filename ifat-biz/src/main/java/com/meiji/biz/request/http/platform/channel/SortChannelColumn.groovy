package com.meiji.biz.request.http.platform.channel

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class SortChannelColumn extends PlatformPost {
    {
        super.api = "ColumnManagement/updateSort"
        super.params =  ["id","sort"]
    }

    SortChannelColumn invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    SortChannelColumn preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    SortChannelColumn baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
