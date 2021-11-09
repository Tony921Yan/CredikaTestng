package com.meiji.test.http.platform.channel


import com.meiji.biz.request.http.platform.channel.UpdateChannelColumn
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class UpdateChannelColumnTest extends BaseTest {
    UpdateChannelColumn updateChannelColumn = new UpdateChannelColumn()
    @Test(description = "更新频道栏目 updateChannelColumn" ,groups = ["prod","uat"],testName = "updateChannelColumn",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateChannelColumn(TestContext testContext){
        updateChannelColumn.invoke(testContext).baseAssert(testContext)
    }
}
