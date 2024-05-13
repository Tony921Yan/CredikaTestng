package com.credika.biz.request.http.platform.channel


import com.miyuan.ifat.support.test.TestContext

class ChannelAdd extends com.credika.biz.request.http.platform.PlatformPost {
    {
        super.api = "ChannelManagement/addChannel"
        super.params =  [ "name","remark","type","appType","childName"]
    }

    ChannelAdd invoke(TestContext testContext) {
        com.credika.biz.service.MysqlService.deleteChannel(testContext.get("name"))
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
