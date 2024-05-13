package com.credika.test.http.shop.order

import com.credika.biz.request.http.shop.order.AccountIndexQuery
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class AccountIndexQueryTest extends BaseTest {
    AccountIndexQuery accountIndexQuery = new AccountIndexQuery()
    @Test(description = "账户资产信息查询 accountIndexQuery" ,groups = ["prod","uat"],testName = "accountIndexQuery",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void accountIndexQuery(TestContext testContext){
        accountIndexQuery.invoke(testContext).baseAssert(testContext)
    }
}
