package com.meiji.test.http.platform.channel

import com.meiji.biz.request.http.platform.channel.ChannelColumnDelete
import com.meiji.biz.request.http.platform.channel.GetChannelColumn
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetChannelColumnTest extends BaseTest {
    GetChannelColumn getChannelColumn = new GetChannelColumn()
    @Test(description = "查询频道栏目 getChannelColumn" ,groups = ["prod","uat"],testName = "getChannelColumn",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getChannelColumn(TestContext testContext){
        getChannelColumn.invoke(testContext).baseAssert(testContext)
    }
}
