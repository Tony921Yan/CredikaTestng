package com.credika.test.api.brand

import com.credika.biz.request.api.brand.BrandDetail
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class BrandDetailTest extends BaseTest {
    BrandDetail brandDetail = new BrandDetail()
    @Test(description = "更新商品 updateGoods" ,groups = ["prod","uat"],testName = "brandDetail",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void test(TestContext testContext){
//        testContext.put("pics", JsonUtil.objToJsonList(testContext.get("pics")))
//        testContext.put("skus", JsonUtil.objToJsonList(testContext.get("skus")))
        brandDetail.invoke(testContext).baseAssert(testContext)
    }
}
