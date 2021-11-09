package com.meiji.biz.request.http.platform.channel

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class SortChannelColumn extends PlatformPost {
    {
        super.api = "platform/channel/column/sort"
        super.params =  ["ids"]
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
        assert testContext.getResponse().code == "0"
        return this
    }

}
