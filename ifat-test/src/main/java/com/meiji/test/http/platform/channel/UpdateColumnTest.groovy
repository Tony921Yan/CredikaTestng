package com.meiji.test.http.platform.channel


import com.meiji.biz.request.http.platform.channel.UpdateColumn
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class UpdateColumnTest extends BaseTest {
    UpdateColumn updateColumn = new UpdateColumn()
    @Test(description = "更新频道栏目 updateColumn" ,groups = ["prod","uat"],testName = "updateColumn",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateColumn(TestContext testContext){
        updateColumn.invoke(testContext).baseAssert(testContext)
    }
}
