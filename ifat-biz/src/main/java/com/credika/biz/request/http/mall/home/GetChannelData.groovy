package com.credika.biz.request.http.mall.home

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

/**
 *
 @author Remy
 @create 2021/11/16-10:48
 @version v2.1
 */
class GetChannelData extends MallPost{
    {
        super.api = "home/getChannelData"
        super.params=["shopId","channelId"]
    }

    GetChannelData invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    GetChannelData baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
