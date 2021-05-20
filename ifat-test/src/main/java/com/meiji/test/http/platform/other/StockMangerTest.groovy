package com.meiji.test.http.platform.other

import com.meiji.biz.request.http.platform.other.StockManger
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class StockMangerTest extends BaseTest {
    StockManger stockManger = new StockManger()
    @Test(description = "库存管理 stockManger" ,groups = ["prod","uat"],testName = "stockManger",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void stockManger(TestContext testContext){
        stockManger.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
