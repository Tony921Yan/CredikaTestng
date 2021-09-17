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
        accountAssetPageQuery.invoke(testContext).baseAssert(testContext)
    }
}
