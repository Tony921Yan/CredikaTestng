package com.meiji.biz.request.http.platform.channel

import com.meiji.biz.request.http.platform.PlatformPost
import com.meiji.biz.service.MysqlService
import com.meiji.biz.util.DateUtil
import com.miyuan.ifat.support.test.TestContext

class ChannelColumnAdd extends PlatformPost {
    {
        super.api = "platform/channel/column/add"
        super.params =  [ "channelId","childName","createBy","name","remark","sort"]
    }

    ChannelColumnAdd invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    ChannelColumnAdd preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    ChannelColumnAdd baseAssert(TestContext testContext){
        assert testContext.getResponse().code == "0"
        return this
    }

}
