package com.meiji.test.http.platform.channel

import com.meiji.biz.request.http.platform.channel.ChannelAdd
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class ChannelAddTest extends BaseTest {
    ChannelAdd channelAdd = new ChannelAdd()
    @Test(description = "添加频道 channelAdd" ,groups = ["prod","uat"],testName = "channelAdd",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void channelAdd(TestContext testContext){
        channelAdd.invoke(testContext).baseAssert(testContext)
    }
}
