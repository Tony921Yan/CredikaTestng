package com.meiji.test.http.brand


import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GoodsPropertyValIsUsedTest extends BaseTest {
    com.meiji.biz.request.http.brand.GoodsPropertyValIsUsed goodsPropertyValIsUsed = new com.meiji.biz.request.http.brand.GoodsPropertyValIsUsed()
    @Test(description = "查商品属性值是否被sku使用 goodsPropertyValIsUsed" ,groups = ["prod","uat"],testName = "goodsPropertyValIsUsed",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void goodsPropertyValIsUsed(TestContext testContext){
        goodsPropertyValIsUsed.invoke(testContext).baseAssert(testContext)
    }
}
