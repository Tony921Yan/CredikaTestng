package com.meiji.test.http.platform.other
import com.meiji.biz.request.http.platform.other.CostPerSalesListGetCurrentCategoryGoods
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class CostPerSalesListGetCurrentCategoryGoodsTest extends BaseTest {
    CostPerSalesListGetCurrentCategoryGoods costPerSalesListGetCurrentCategoryGoods = new CostPerSalesListGetCurrentCategoryGoods()
    @Test(description = "查询当前分类的商品 costPerSalesListGetCurrentCategoryGoods" ,groups = ["prod","uat"],testName = "costPerSalesListGetCurrentCategoryGoods",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void costPerSalesListGetCurrentCategoryGoods(TestContext testContext){
        costPerSalesListGetCurrentCategoryGoods.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}