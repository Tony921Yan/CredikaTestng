package com.meiji.test.http.platform.channel


import com.meiji.biz.request.http.platform.channel.UpdateChannel
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class UpdateChannelTest extends BaseTest {
    UpdateChannel updateChannel = new UpdateChannel()
    @Test(description = "添加频道 channelUpdate" ,groups = ["prod","uat"],testName = "updateChannel",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateChannel(TestContext testContext){
        updateChannel.invoke(testContext).baseAssert(testContext)
    }
}
