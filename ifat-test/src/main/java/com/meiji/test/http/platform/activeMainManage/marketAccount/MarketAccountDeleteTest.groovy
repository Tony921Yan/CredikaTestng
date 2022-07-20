package com.meiji.test.http.platform.activeMainManage.marketAccount

import com.meiji.biz.request.http.platform.activeMainManage.marketAccount.MarketAccountAdd
import com.meiji.biz.request.http.platform.activeMainManage.marketAccount.MarketAccountDelete
import com.meiji.biz.service.MysqlService
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class MarketAccountDeleteTest extends BaseTest {
    MarketAccountAdd marketAccountAdd  = new MarketAccountAdd()
    MarketAccountDelete marketAccountDelete = new MarketAccountDelete()
    @Test(description = "营销账户删除 marketAccountDelete" ,groups = ["prod","uat"],testName = "marketAccountDelete",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void marketAccountDelete(TestContext testContext){
        marketAccountAdd.invoke(testContext).baseAssert(testContext).afterInvoke(testContext)
        marketAccountDelete.invoke(testContext).baseAssert(testContext)
        marketAccountDelete.specialAssert(testContext)
    }
//    @Test(description = "营销账户-物理删除 marketAccountRealDelete" ,groups = ["uat"],testName = "marketAccountDelete",
//            dataProvider = "dataProvider",dataProviderClass = TestData.class)
//    public void marketAccountRealDelete(TestContext testContext){
//        marketAccountAdd.invoke(testContext).baseAssert(testContext).afterInvoke(testContext)
//        marketAccountDelete.invoke(testContext).baseAssert(testContext)
//        marketAccountDelete.specialAssert(testContext)
//        //为防止数据太多做物理删除
//        MysqlService.marketAccountRealDelete(testContext.get("id"))
//    }
}