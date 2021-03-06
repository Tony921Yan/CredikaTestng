package com.meiji.test.http.brand

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.brand.UpdateBrand
import org.testng.annotations.Test

class UpdateBrandTest extends BaseTest {
    UpdateBrand updateBrand = new UpdateBrand()
    @Test(description = "更新商品属性信息 updateBrand" ,groups = ["prod","uat"],testName = "updateBrand",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateBrand(TestContext testContext){
        updateBrand.invoke(testContext).baseAssert(testContext)
    }
}
