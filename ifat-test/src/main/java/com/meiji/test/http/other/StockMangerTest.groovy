package com.meiji.test.http.other

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.other.StockManger
import org.testng.annotations.Test

class StockMangerTest extends BaseTest {
    StockManger stockManger = new StockManger()
    @Test(description = "库存管理 stockManger" ,groups = ["prod","uat"],testName = "stockManger",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void stockManger(TestContext testContext){
        stockManger.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
