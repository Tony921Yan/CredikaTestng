package com.meiji.test.http.platform.accountmanager

import com.meiji.biz.request.http.platform.accountmanager.AccountAssetExport
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class AccountAssetExportTest extends BaseTest {
    AccountAssetExport accountAssetExport = new AccountAssetExport()
    @Test(description = "账户资产导出 accountAssetExport" ,groups = ["prod","uat"],testName = "accountAssetExport",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void accountAssetExport(TestContext testContext){
        accountAssetExport.invoke(testContext).baseAssert(testContext)
    }
}
