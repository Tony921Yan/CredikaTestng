package com.meiji.test.http.brand

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.api.brand.CreateBrand
import org.testng.annotations.Test

class CreateBrandTest extends BaseTest {
    CreateBrand createBrand = new CreateBrand()
    @Test(description = "创建品牌 createBrand" ,groups = ["prod","uat"],testName = "createBrand",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void createBrand(TestContext testContext){
        createBrand.invoke(testContext).baseAssert(testContext)
    }
}
