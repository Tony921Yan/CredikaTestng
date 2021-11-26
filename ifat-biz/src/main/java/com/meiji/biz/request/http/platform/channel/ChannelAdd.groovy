package com.meiji.biz.request.http.platform.channel

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class ChannelAdd extends PlatformPost {
    {
        super.api = "ChannelManagement/addChannel"
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
        super.baseAssert(testContext)
        return this
    }

}
