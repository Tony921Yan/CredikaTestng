package com.meiji.test.http.platform.stockManger
import com.meiji.biz.request.http.platform.stockManger.GetSkuStock
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetSkuStockTest extends BaseTest {
    GetSkuStock getSkuStock = new GetSkuStock()
    @Test(description = "查询sku库存信息,getSkuStock ", groups = ["prod", "uat"], testName = "getSkuStock",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void getSkuStock(TestContext testContext) {
        getSkuStock.invoke(testContext).baseAssert(testContext)
    }
}


