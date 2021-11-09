package com.meiji.biz.request.http.platform.channel

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class ChannelUpdate extends PlatformPost {
    {
        super.api = "platform/channel/update"
        super.params =  [ "appType","childName","id","name","remark","updateBy"]
    }

    ChannelUpdate invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    ChannelUpdate preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    ChannelUpdate baseAssert(TestContext testContext){
        assert testContext.getResponse().code == "0"
        return this
    }

}
