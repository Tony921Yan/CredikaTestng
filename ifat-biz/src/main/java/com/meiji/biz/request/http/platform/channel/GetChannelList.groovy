package com.meiji.biz.request.http.platform.channel

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext
/**
 *
 @author Remy
 @create 2021/11/18-17:50
 @version v2.1
 */
class GetChannelList extends PlatformPost {
    {
        super.api = "ChannelManagement/getChannelList"
        super.params =  ["page","rows"]
    }

    GetChannelList invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetChannelList preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetChannelList baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
