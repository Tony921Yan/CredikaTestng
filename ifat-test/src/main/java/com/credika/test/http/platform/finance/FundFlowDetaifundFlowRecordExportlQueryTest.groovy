package com.credika.test.http.platform.finance

import com.credika.biz.request.http.platform.finance.FundFlowDetaifundFlowRecordExportlQuery
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class FundFlowDetaifundFlowRecordExportlQueryTest extends BaseTest {
    FundFlowDetaifundFlowRecordExportlQuery fundFlowDetaifundFlowRecordExportlQuery = new FundFlowDetaifundFlowRecordExportlQuery()
    @Test(description = "资金流水导出 fundFlowDetaifundFlowRecordExportlQuery" ,groups = ["prod","uat"],testName = "fundFlowDetaifundFlowRecordExportlQuery",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void fundFlowDetaifundFlowRecordExportlQuery(TestContext testContext){
        fundFlowDetaifundFlowRecordExportlQuery.invoke(testContext).baseAssert(testContext)
    }
}
