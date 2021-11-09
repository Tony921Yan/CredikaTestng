package com.meiji.biz.request.http.platform.channel

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class ChannelAdd extends PlatformPost {
    {
        super.api = "platform/channel/add"
        super.params =  [ "appType","childName","createBy","name","remark","type"]
    }

    ChannelAdd invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    ChannelAdd preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    ChannelAdd baseAssert(TestContext testContext){
        assert testContext.getResponse().code == "0"
        return this
    }

}
