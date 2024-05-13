package com.credika.test.http.platform.cps

import com.credika.biz.request.http.platform.cps.CostPerSalesListGetCpsGoods
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class CostPerSalesListGetCpsGoodsTest extends BaseTest {
    CostPerSalesListGetCpsGoods costPerSalesListGetCpsGoods = new CostPerSalesListGetCpsGoods()
    @Test(description = "查询cps商品 costPerSalesListGetCpsGoods" ,groups = ["prod","uat"],testName = "costPerSalesListGetCpsGoods",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void costPerSalesListGetCpsGoods(TestContext testContext){
        costPerSalesListGetCpsGoods.invoke(testContext).baseAssert(testContext)
    }
}
