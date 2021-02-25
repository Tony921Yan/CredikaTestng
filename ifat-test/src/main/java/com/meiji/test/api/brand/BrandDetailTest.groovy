package com.meiji.test.api.brand

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.api.brand.BrandDetail
import org.testng.annotations.Test

class BrandDetailTest extends BaseTest {
    BrandDetail brandDetail = new BrandDetail()
    @Test(description = "品牌详情 brandDetail" ,groups = ["prod","uat"],testName = "brandDetail",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void brandDetail(TestContext testContext){
        brandDetail.invoke(testContext).baseAssert(testContext)
    }
}
