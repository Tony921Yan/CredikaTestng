package com.credika.test.http.scrm.channel

import com.credika.biz.request.http.scrm.channel.ChannelList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/8/23-16:36
 */
class ChannelListTest extends BaseTest {
    ChannelList channelList = new ChannelList()

    @Test(description = "渠道活码列表", groups = ["prod", "uat"], testName = "channelist",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        channelList.invoke(testContext).baseAssert(testContext)
    }

}
