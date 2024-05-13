package com.credika.biz.request.http.platform.channel


import com.miyuan.ifat.support.test.TestContext

class UpdateChannel extends com.credika.biz.request.http.platform.PlatformPost {
    {
        super.api = "ChannelManagement/updateChannel"
        super.params =  [ "appType","childName","id","name","remark","type"]
    }

    UpdateChannel invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    UpdateChannel preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    UpdateChannel baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
