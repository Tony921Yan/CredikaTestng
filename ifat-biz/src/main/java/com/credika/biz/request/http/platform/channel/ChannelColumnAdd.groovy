package com.credika.biz.request.http.platform.channel


import com.miyuan.ifat.support.test.TestContext

class ChannelColumnAdd extends com.credika.biz.request.http.platform.PlatformPost {
    {
        super.api = "ColumnManagement/addColumn"
        super.params =  [ "name","childName","remark","name","channelId"]
    }

    ChannelColumnAdd invoke(TestContext testContext) {
        com.credika.biz.service.MysqlService.deleteChannelColumn(testContext.get("name"))
        super.invoke(testContext)
        return this
    }

    ChannelColumnAdd preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    ChannelColumnAdd baseAssert(TestContext testContext){
        assert testContext.getResponse().code == 0
        return this
    }

}
