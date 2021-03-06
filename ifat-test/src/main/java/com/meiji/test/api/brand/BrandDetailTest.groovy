package com.meiji.test.api.brand

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.api.test.CenterGetCouponUrl
import org.testng.annotations.Test

class BrandDetailTest extends BaseTest {
    CenterGetCouponUrl centerGetCouponUrl = new CenterGetCouponUrl()
    @Test(description = "更新商品 updateGoods" ,groups = ["prod","uat"],testName = "brandDetail",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void test(TestContext testContext){
//        testContext.put("pics", JsonUtil.objToJsonList(testContext.get("pics")))
//        testContext.put("skus", JsonUtil.objToJsonList(testContext.get("skus")))
        centerGetCouponUrl.invoke(testContext).baseAssert(testContext)
    }
}
