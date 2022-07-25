package com.meiji.test.http.OMS.account
import com.meiji.biz.request.http.OMS.account.FundFlowDetailQuery
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class FundFlowDetailQueryTest extends BaseTest {
    FundFlowDetailQuery fundFlowDetailQuery = new FundFlowDetailQuery()
    @Test(description = "资金流水详情查询 fundFlowDetailQuery" ,groups = ["prod","uat"],testName = "OMSfundFlowDetailQuery",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void fundFlowDetailQuery(TestContext testContext){
        fundFlowDetailQuery.invoke(testContext).baseAssert(testContext)
    }
}
