package com.credika.test.http.platform.channel
import com.credika.biz.request.http.platform.channel.SearchBuyerShow
import com.credika.biz.request.http.platform.channel.UpdateBuyer
import com.credika.biz.service.MysqlService
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class UpdateBuyerTest extends BaseTest {
    UpdateBuyer updateBuyer = new UpdateBuyer()
    SearchBuyerShow searchBuyerShow = new SearchBuyerShow()
    @Test(description = "更新晒单(溯源) updateBuyer" ,groups = ["prod","uat"],testName = "updateBuyer",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateColumn(TestContext testContext){
        testContext.put("columnId", MysqlService.searchBuyerShow())
        testContext.put("contentSource",1)
        testContext.put("page",1)
        testContext.put("rows",20)
        searchBuyerShow.invoke(testContext).baseAssert(testContext).afterInvoke(testContext)
        updateBuyer.invoke(testContext).baseAssert(testContext)
    }
}
