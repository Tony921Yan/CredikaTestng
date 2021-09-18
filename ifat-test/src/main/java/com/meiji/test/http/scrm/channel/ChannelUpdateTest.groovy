package com.meiji.test.http.scrm.channel

import com.meiji.biz.request.http.scrm.channel.ChannelUpdate
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/9/17-18:15
 */
class ChannelUpdateTest extends BaseTest {
    ChannelUpdate channel = new ChannelUpdate()

    @Test(description = "修改渠道活码", groups = ["prod", "uat"], testName = "channelupdate",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        channel.invoke(testContext).baseAssert(testContext)
    }
}
