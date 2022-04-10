package com.meiji.test.http.platform.cps

import com.meiji.biz.request.http.platform.cps.CostPerSalesListChangeCpsGoodsCategory
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class CostPerSalesListChangeCpsGoodsCategoryTest extends BaseTest {
    CostPerSalesListChangeCpsGoodsCategory costPerSalesListChangeCpsGoodsCategory = new CostPerSalesListChangeCpsGoodsCategory()
    @Test(description = "更换分类 costPerSalesListChangeCpsGoodsCategory" ,groups = ["prod","uat"],testName = "costPerSalesListChangeCpsGoodsCategory",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void costPerSalesListChangeCpsGoodsCategory(TestContext testContext){
        costPerSalesListChangeCpsGoodsCategory.invoke(testContext).baseAssert(testContext)
    }
}
