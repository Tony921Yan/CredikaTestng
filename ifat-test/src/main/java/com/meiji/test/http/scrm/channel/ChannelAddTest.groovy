package com.meiji.test.http.scrm.channel

import com.meiji.biz.request.http.scrm.channel.ChannelAdd
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/9/17-16:34
 */
class ChannelAddTest extends BaseTest {
    ChannelAdd channel = new ChannelAdd()

    @Test(description = "新建渠道活码", groups = ["prod", "uat"], testName = "channeladd",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        channel.invoke(testContext).baseAssert(testContext)
    }
}
