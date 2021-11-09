package com.meiji.biz.request.http.platform.channel

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class ChannelColumnDelete extends PlatformPost {
    {
        super.api = "platform/channel/column/delete"
        super.params =  [ "id"]
    }

    ChannelColumnDelete invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    ChannelColumnDelete preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    ChannelColumnDelete baseAssert(TestContext testContext){
        assert testContext.getResponse().code == "0"
        return this
    }

}
