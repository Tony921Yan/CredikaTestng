package com.meiji.biz.request.http.platform.channel

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class GetChannelColumn extends PlatformPost {
    {
        super.api = "ColumnManagement/getColumnList"
        super.params =  ["channelId", "id"]
    }

    GetChannelColumn invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetChannelColumn preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetChannelColumn baseAssert(TestContext testContext){
        assert testContext.getResponse().code == 0
        return this
    }

}
