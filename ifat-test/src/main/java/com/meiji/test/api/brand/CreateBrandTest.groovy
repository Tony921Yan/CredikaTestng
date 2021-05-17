package com.meiji.test.api.brand


import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class CreateBrandTest extends BaseTest {
    com.meiji.biz.request.api.brand.CreateBrand createBrand = new com.meiji.biz.request.api.brand.CreateBrand()
    @Test(description = "创建品牌 createBrand" ,groups = ["prod","uat"],testName = "createBrand",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void createBrand(TestContext testContext){
        createBrand.invoke(testContext).baseAssert(testContext)
    }
}
