package com.credika.biz.request.http.platform.channel


import com.miyuan.ifat.support.test.TestContext

class ChannelDelete extends com.credika.biz.request.http.platform.PlatformPost {
    {
        super.api = "ChannelManagement/deleteChannel"
        super.params =  [ "id"]
    }

    ChannelDelete invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    ChannelDelete baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
