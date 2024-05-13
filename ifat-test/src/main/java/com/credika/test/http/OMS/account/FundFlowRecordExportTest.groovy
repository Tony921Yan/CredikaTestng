package com.credika.test.http.OMS.account
import com.credika.biz.request.http.OMS.account.FundFlowRecordExport
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class FundFlowRecordExportTest extends BaseTest {
    FundFlowRecordExport fundFlowRecordExport = new FundFlowRecordExport()
    @Test(description = "资金流水记录导出 fundFlowRecordExport" ,groups = ["prod","uat"],testName = "OMSfundFlowRecordExport",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void fundFlowRecordExport(TestContext testContext){
        fundFlowRecordExport.invoke(testContext).baseAssert(testContext)
    }
}
