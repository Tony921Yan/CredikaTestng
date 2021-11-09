package com.meiji.biz.request.http.platform.channel

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class UpdateChannelColumn extends PlatformPost {
    {
        super.api = "platform/channel/column/update"
        super.params =  ["childName","id","name","remark","updateBy"]
    }

    UpdateChannelColumn invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    UpdateChannelColumn preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    UpdateChannelColumn baseAssert(TestContext testContext){
        assert testContext.getResponse().code == "0"
        return this
    }

}
