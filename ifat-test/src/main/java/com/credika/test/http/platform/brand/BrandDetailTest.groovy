package com.credika.test.http.platform.brand

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.credika.biz.request.http.platform.brand.BrandDetail
import org.testng.annotations.Test

class BrandDetailTest extends BaseTest {
    BrandDetail brandDetail = new BrandDetail()
    @Test(description = "品牌詳情 brandDetail" ,groups = ["prod","uat"],testName = "brandDetail",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void brandDetail(TestContext testContext){
        brandDetail.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
