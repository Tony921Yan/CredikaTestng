package com.credika.test.http.platform.activeMainManage.marketAccount

import com.credika.biz.request.http.platform.activeMainManage.marketAccount.MarketAccountAdd
import com.credika.biz.service.MysqlService
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class MarketAccountAddTest extends BaseTest {
    MarketAccountAdd marketAccountAdd  = new MarketAccountAdd()
    String  accountName = null;
    @Test(description = "营销账户添加接口 marketAccountAdd" ,groups = ["prod","uat"],testName = "marketAccountAdd",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void marketAccountAdd(TestContext testContext){
        marketAccountAdd.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
        accountName = testContext.get("accountName")
    }
    @Test(description = "营销账户添加接口--物理删除 marketAccountAdd-delete" ,groups = ["uat"],testName = "marketAccountAdd",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void marketAccountAdd1(TestContext testContext){
        testContext.get("accountName",accountName)
        //为防止数据太多做物理删除
        MysqlService.marketAccountRealDelete1(testContext.get("accountName"))
    }
}