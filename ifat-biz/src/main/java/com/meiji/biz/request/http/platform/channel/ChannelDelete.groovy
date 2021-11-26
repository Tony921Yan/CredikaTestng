package com.meiji.biz.request.http.platform.channel

import com.meiji.biz.request.http.platform.PlatformPost
import com.meiji.biz.service.MysqlService
import com.miyuan.ifat.support.test.TestContext

class ChannelDelete extends PlatformPost {
    private String value;
    {
        super.api = "platform/channel/delete"
        super.params =  [ "id"]
    }

    ChannelDelete invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    ChannelDelete preInvoke(TestContext testContext){
        ChannelDelete channelDelete = new ChannelDelete()
       Map mysqlResult = MysqlService.getChannel()
        System.out.println(mysqlResult.get("id"))
        channelDelete.setProperty("value",mysqlResult.get("id"))
        return channelDelete;
    }

    ChannelDelete baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
