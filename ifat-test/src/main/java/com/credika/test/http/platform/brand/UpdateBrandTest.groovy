package com.credika.test.http.platform.brand

import com.credika.biz.request.http.platform.brand.QueryPage
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.credika.biz.request.http.platform.brand.UpdateBrand
import org.testng.annotations.Test

class UpdateBrandTest extends BaseTest {
    UpdateBrand updateBrand = new UpdateBrand()
    @Test(description = "更新品牌属性信息 updateBrand" ,groups = ["prod","uat"],testName = "updateBrand",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)

    public void updateBrand(TestContext testContext){
        updateBrand.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }

    QueryPage queryPage = new QueryPage()
    @Test(description = "更新品牌属性后再带条件搜索 queryPage_search",groups = ["uat","prod"],testName = "queryPage_search",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void queryPage(TestContext testContext){
        queryPage.invoke(testContext).baseAssert(testContext)
    }

}
