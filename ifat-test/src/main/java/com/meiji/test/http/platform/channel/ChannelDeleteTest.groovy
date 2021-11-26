package com.meiji.test.http.platform.channel

import com.meiji.biz.request.http.platform.channel.ChannelDelete
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class ChannelDeleteTest extends BaseTest {
    ChannelDelete channelDelete = new ChannelDelete()
    @Test(description = "删除频道 channelDelete" ,groups = ["prod","uat"],testName = "channelDelete",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void channelDelete(TestContext testContext){
        ChannelDelete channel = channelDelete.preInvoke(testContext)
        System.out.println(channel.getProperty("value"));
//        System.out.println(channelDelete.preInvoke(testContext))
//        testContext.put("id",channelDelete.preInvoke(testContext))
        channelDelete.invoke(testContext).baseAssert(testContext)
    }
}
