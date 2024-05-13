package com.credika.test.http.platform.cps
import com.credika.biz.request.http.platform.cps.CostPerSalesListRemoveCpsGoods
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class CostPerSalesListRemoveCpsGoodsTest extends BaseTest {
    CostPerSalesListRemoveCpsGoods costPerSalesListRemoveCpsGoods = new CostPerSalesListRemoveCpsGoods()
    @Test(description = "移除cps商品 costPerSalesListRemoveCpsGoods" ,groups = ["prod","uat"],testName = "costPerSalesListRemoveCpsGoods",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void costPerSalesListRemoveCpsGoods(TestContext testContext){
        costPerSalesListRemoveCpsGoods.invoke(testContext).baseAssert(testContext)
    }
}
