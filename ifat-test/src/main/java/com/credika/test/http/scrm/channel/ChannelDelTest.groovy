package com.credika.test.http.scrm.channel

import com.credika.biz.request.http.scrm.channel.ChannelDel
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/9/17-17:58
 */
class ChannelDelTest extends BaseTest {
    ChannelDel channel = new ChannelDel()

    @Test(description = "删除渠道活码", groups = ["prod", "uat"], testName = "channeldel",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        channel.invoke(testContext).baseAssert(testContext)
    }
}
