package com.credika.test.http.platform.cps
import com.credika.biz.request.http.platform.cps.CostPerSalesListSaveCpsGoods
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class CostPerSalesListSaveCpsGoodsTest extends BaseTest {
    CostPerSalesListSaveCpsGoods costPerSalesListSaveCpsGoods = new CostPerSalesListSaveCpsGoods()
    @Test(description = "保存cps商品 costPerSalesListSaveCpsGoods" ,groups = ["prod","uat"],testName = "costPerSalesListSaveCpsGoods",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void costPerSalesListSaveCpsGoods(TestContext testContext){
        costPerSalesListSaveCpsGoods.invoke(testContext).baseAssert(testContext)
    }
}


