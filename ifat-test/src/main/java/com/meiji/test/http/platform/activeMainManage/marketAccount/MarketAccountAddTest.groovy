package com.meiji.test.http.platform.activeMainManage.marketAccount

import com.meiji.biz.request.http.platform.activeMainManage.marketAccount.MarketAccountAdd
import com.meiji.biz.service.MysqlService
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class MarketAccountAddTest extends BaseTest {
    MarketAccountAdd marketAccountAdd  = new MarketAccountAdd()
    @Test(description = "营销账户添加接口 marketAccountAdd" ,groups = ["prod","uat"],testName = "marketAccountAdd",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void marketAccountAdd(TestContext testContext){
        marketAccountAdd.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
        //为防止数据太多做物理删除
        MysqlService.marketAccountRealDelete1(testContext.get("accountName"))
    }

}