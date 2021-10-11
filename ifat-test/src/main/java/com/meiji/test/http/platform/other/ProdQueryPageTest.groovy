package com.meiji.test.http.platform.other

import com.meiji.biz.request.http.platform.other.ProdQueryPage
import com.meiji.biz.request.http.platform.other.QueryStockRecord
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class ProdQueryPageTest extends BaseTest {
    ProdQueryPage prodQueryPage = new ProdQueryPage()
    @Test(description = "合同分页查询 prodQueryPage" ,groups = ["prod","uat"],testName = "prodQueryPage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void prodQueryPage(TestContext testContext){
        prodQueryPage.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
