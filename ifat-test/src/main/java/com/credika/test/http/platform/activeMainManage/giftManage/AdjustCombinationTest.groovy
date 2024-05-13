package com.credika.test.http.platform.activeMainManage.giftManage
import com.credika.biz.request.http.platform.activeMainManage.giftManage.AdjustCombination
import com.credika.biz.service.MysqlService
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class AdjustCombinationTest extends BaseTest {
    AdjustCombination adjustCombination = new AdjustCombination()
    @Test(description = "送礼管理-组合礼品-上架" ,groups = ["prod","uat"],testName = "adjustCombination",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void adjustCombination(TestContext testContext){
        testContext.put("id", MysqlService.adjustCombination().get(0))
        testContext.put("action",1)
        adjustCombination.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "送礼管理-组合礼品-下架" ,groups = ["prod","uat"],testName = "adjustCombination01",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void adjustCombination01(TestContext testContext){
        testContext.put("id", MysqlService.adjustCombination01().get(0))
        testContext.put("action",0)
        adjustCombination.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "送礼管理-组合礼品-删除" ,groups = ["prod","uat"],testName = "adjustCombination02",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void adjustCombination02(TestContext testContext){
        testContext.put("id", MysqlService.adjustCombination().get(0))
        testContext.put("action",2)
        adjustCombination.invoke(testContext).baseAssert(testContext)
    }



}