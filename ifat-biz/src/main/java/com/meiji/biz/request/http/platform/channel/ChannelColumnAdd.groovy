package com.meiji.biz.request.http.platform.channel

import com.meiji.biz.request.http.platform.PlatformPost
import com.meiji.biz.service.MysqlService
import com.miyuan.ifat.support.test.TestContext

class ChannelColumnAdd extends PlatformPost {
    {
        super.api = "ColumnManagement/addColumn"
        super.params =  [ "name","childName","remark","name","channelId"]
    }

    ChannelColumnAdd invoke(TestContext testContext) {
        MysqlService.deleteChannelColumn(testContext.get("name"))
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
