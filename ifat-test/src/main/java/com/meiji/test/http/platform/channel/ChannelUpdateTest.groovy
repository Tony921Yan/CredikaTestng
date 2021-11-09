package com.meiji.test.http.platform.channel

import com.meiji.biz.request.http.platform.channel.ChannelAdd
import com.meiji.biz.request.http.platform.channel.ChannelUpdate
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class ChannelUpdateTest extends BaseTest {
    ChannelUpdate channelUpdate = new ChannelUpdate()
    @Test(description = "添加频道 channelUpdate" ,groups = ["prod","uat"],testName = "channelUpdate",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void channelUpdate(TestContext testContext){
        channelUpdate.invoke(testContext).baseAssert(testContext)
    }
}
