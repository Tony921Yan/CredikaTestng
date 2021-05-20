package com.meiji.test.http.platform.brand

import com.meiji.biz.request.http.platform.brand.GoodsPropertyValIsUsed
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GoodsPropertyValIsUsedTest extends BaseTest {
    GoodsPropertyValIsUsed goodsPropertyValIsUsed = new GoodsPropertyValIsUsed()
    @Test(description = "查商品属性值是否被sku使用 goodsPropertyValIsUsed" ,groups = ["prod","uat"],testName = "goodsPropertyValIsUsed",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void goodsPropertyValIsUsed(TestContext testContext){
        goodsPropertyValIsUsed.invoke(testContext).baseAssert(testContext)
    }
}
