package com.meiji.test.http.other


import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class StockMangerTest extends BaseTest {
    com.meiji.biz.request.http.other.StockManger stockManger = new com.meiji.biz.request.http.other.StockManger()
    @Test(description = "库存管理 stockManger" ,groups = ["prod","uat"],testName = "stockManger",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void stockManger(TestContext testContext){
        stockManger.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
