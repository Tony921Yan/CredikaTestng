package com.meiji.test.http.platform.other

import com.meiji.biz.request.http.platform.other.CostPerSalesListGetSelectedGoods
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class CostPerSalesListGetSelectedGoodsTest extends BaseTest {
    CostPerSalesListGetSelectedGoods costPerSalesListGetSelectedGoods = new CostPerSalesListGetSelectedGoods()
    @Test(description = "获取已选商品列表数据 costPerSalesListGetSelectedGoods", groups = ["prod", "uat"], testName = "costPerSalesListGetSelectedGoods",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void costPerSalesListGetSelectedGoods(TestContext testContext) {
        costPerSalesListGetSelectedGoods.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}