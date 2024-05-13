package com.credika.test.api.brand

import com.credika.biz.request.api.brand.UpdateBrand
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class UpdateBrandTest extends BaseTest {
    UpdateBrand updateBrand = new UpdateBrand()
    @Test(description = "更新商品属性信息 updateBrand" ,groups = ["prod","uat"],testName = "updateBrand",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateBrand(TestContext testContext){
        updateBrand.invoke(testContext).baseAssert(testContext)
    }
}
