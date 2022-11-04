package com.meiji.test.http.platform.channel
import com.meiji.biz.request.http.platform.channel.DeleteBuyerShow
import com.meiji.biz.service.MysqlService
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class DeleteBuyerShowTest extends BaseTest {
    DeleteBuyerShow deleteBuyerShow = new DeleteBuyerShow()
    @Test(description = "晒单管理-删除晒单(溯源) deleteBuyerShow" ,groups = ["prod","uat"],testName = "deleteBuyerShow",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void deleteBuyerShow(TestContext testContext){
        ArrayList<Long> list = MysqlService.deleteBuyerShow()
        testContext.put("ids",list )
        deleteBuyerShow.invoke(testContext).baseAssert(testContext)
    }
}
