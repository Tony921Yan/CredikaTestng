package com.meiji.biz.request.http.platform.channel

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class ChannelDelete extends PlatformPost {
    {
        super.api = "platform/channel/delete"
        super.params =  [ "id"]
    }

    ChannelDelete invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    ChannelDelete preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    ChannelDelete baseAssert(TestContext testContext){
        assert testContext.getResponse().code == "0"
        return this
    }

}
