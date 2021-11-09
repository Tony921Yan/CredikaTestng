package com.meiji.test.http.platform.channel

import com.meiji.biz.request.http.platform.channel.ChannelColumnDelete
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class ChannelColumnDeleteTest extends BaseTest {
    ChannelColumnDelete channelColumnDelete = new ChannelColumnDelete()
    @Test(description = "删除频道栏目 channelColumnDelete" ,groups = ["prod","uat"],testName = "channelColumnDelete",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void channelColumnDelete(TestContext testContext){
        channelColumnDelete.invoke(testContext).baseAssert(testContext)
    }
}
