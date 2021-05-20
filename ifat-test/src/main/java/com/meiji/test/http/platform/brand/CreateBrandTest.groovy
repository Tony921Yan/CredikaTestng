package com.meiji.test.http.platform.brand

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.meiji.biz.request.http.platform.brand.CreateBrand
import org.testng.annotations.Test

class CreateBrandTest extends BaseTest {
    CreateBrand createBrand = new CreateBrand()
    @Test(description = "创建品牌 createBrand" ,groups = ["prod","uat"],testName = "createBrand",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void createBrand(TestContext testContext){
        createBrand.invoke(testContext).baseAssert(testContext)
    }
}
