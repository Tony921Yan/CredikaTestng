package com.meiji.test.http.platform.finance


import com.meiji.biz.request.http.platform.finance.WithdrawRecordExport
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class WithdrawRecordExportTest extends BaseTest {
    WithdrawRecordExport withdrawRecordExport = new WithdrawRecordExport()
    @Test(description = "提现记录导出 withdrawRecordExport" ,groups = ["prod","uat"],testName = "withdrawRecordExport",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void withdrawRecordExport(TestContext testContext){
        withdrawRecordExport.invoke(testContext).baseAssert(testContext)
    }
}
