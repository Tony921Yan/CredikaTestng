package com.meiji.test.api.brand

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.api.brand.GoodsPropertyValIsUsed
import org.testng.annotations.Test

class GoodsPropertyValIsUsedTest extends BaseTest {
    GoodsPropertyValIsUsed goodsPropertyValIsUsed = new GoodsPropertyValIsUsed()
    @Test(description = "查商品属性值是否被sku使用 goodsPropertyValIsUsed" ,groups = ["prod","uat"],testName = "goodsPropertyValIsUsed",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void goodsPropertyValIsUsed(TestContext testContext){
        goodsPropertyValIsUsed.invoke(testContext).baseAssert(testContext)
    }
}
