package com.credika.test.http.platform.finance


import com.credika.biz.request.http.platform.finance.FundFlowDetailQuery
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class FundFlowDetailQueryTest extends BaseTest { //对应接口orderDetailQuery
    FundFlowDetailQuery fundFlowDetailQuery = new FundFlowDetailQuery()
    @Test(description = "资金明细查询 fundFlowDetailQuery" ,groups = ["prod","uat"],testName = "fundFlowDetailQuery_platform",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void fundFlowDetailQuery(TestContext testContext){
        fundFlowDetailQuery.invoke(testContext).baseAssert(testContext)
    }
}
