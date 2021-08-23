package com.meiji.test.http.scrm.qrcode

import com.meiji.biz.request.http.scrm.qrcode.ChannelDetail
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/8/23-16:42
 */
class ChannelDetailTest extends BaseTest {
    ChannelDetail channelDetail = new ChannelDetail()

    @Test(description = "渠道活码详情", groups = ["prod", "uat"], testName = "channeldetail",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        channelDetail.invoke(testContext).baseAssert(testContext)
    }
}
