package com.meiji.test.http.platform.live
import com.meiji.biz.request.http.platform.live.DeleteLive
import com.meiji.biz.service.MysqlService
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class DeleteLiveTest extends BaseTest {
    DeleteLive deleteLive = new DeleteLive()
    @Test(description = "删除直播间  deleteLive" ,groups = ["prod","uat"],testName = "deleteLive",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void deleteLive(TestContext testContext){
        if( testContext.put("id", MysqlService.liveID()) !=null){
            testContext.put("id", MysqlService.liveID())
            deleteLive.invoke(testContext).baseAssert(testContext)
        }
    }
}
