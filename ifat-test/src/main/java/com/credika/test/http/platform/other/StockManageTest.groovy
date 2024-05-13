package com.credika.test.http.platform.other

import com.credika.biz.request.http.platform.other.StockManage
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class StockManageTest extends BaseTest {
    StockManage stockManage = new StockManage()
    @Test(description = "库存划拨单 stockManage" ,groups = ["prod","uat"],testName = "stockManage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void stockManage(TestContext testContext){
        stockManage.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
