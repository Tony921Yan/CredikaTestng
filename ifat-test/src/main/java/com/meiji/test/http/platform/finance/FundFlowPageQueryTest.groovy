package com.meiji.test.http.platform.finance


import com.meiji.biz.request.http.platform.finance.FundFlowPageQuery
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class FundFlowPageQueryTest extends BaseTest {
    FundFlowPageQuery fundFlowPageQuery = new FundFlowPageQuery()
    @Test(description = "资金记录分页查询 fundFlowPageQuery" ,groups = ["prod","uat"],testName = "fundFlowPageQuery",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void fundFlowPageQuery(TestContext testContext){
        fundFlowPageQuery.invoke(testContext).baseAssert(testContext)
    }
}
