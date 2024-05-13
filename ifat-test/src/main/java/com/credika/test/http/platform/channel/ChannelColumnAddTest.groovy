package com.credika.test.http.platform.channel

import com.credika.biz.request.http.platform.channel.ChannelColumnAdd
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class ChannelColumnAddTest extends BaseTest {
    ChannelColumnAdd channelColumnAdd = new ChannelColumnAdd()
    @Test(description = "频道添加栏目 channelColumnAdd" ,groups = ["prod","uat"],testName = "channelColumnAdd",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void channelColumnAdd(TestContext testContext){
        channelColumnAdd.invoke(testContext).baseAssert(testContext)
    }
}
