package com.meiji.test.http.platform.finance


import com.meiji.biz.request.http.platform.finance.AccountAssetPageQuery
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class AccountAssetPageQueryTest extends BaseTest {
    AccountAssetPageQuery accountAssetPageQuery = new AccountAssetPageQuery()
    @Test(description = "账户资产分页查询 accountAssetPageQuery" ,groups = ["prod","uat"],testName = "accountAssetPageQuery_platform",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void accountAssetPageQuery(TestContext testContext){
        accountAssetPageQuery.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }

    AccountAssetPageQuery accountAssetPageQueryByAll = new AccountAssetPageQuery()
    //截止9月21日:获取516条总资产存在差额的数据，每次只能调用100条，否则会在调用30秒内超时
    //截止10月23日：获取555条
    @Test(description = "获取所有账号财务数据 accountAssetPageQueryByAll",groups = ["prod","uat"],testName = "accountAssetPageQueryByAll_platform",
            dataProvider =  "dataProvider",dataProviderClass = TestData.class)
    public void accountAssetPageQueryByAll(TestContext testContext){
        accountAssetPageQueryByAll.invoke(testContext).baseAssert(testContext)
        accountAssetPageQueryByAll.getallAccountData(testContext)
    }
}
