package com.meiji.test.http.platform.shopManager


import com.meiji.biz.request.http.platform.shopmanager.FindShopPage
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class FindShopPageTest extends BaseTest {
    FindShopPage findShopPage = new FindShopPage()
    @Test(description = "查询店铺分页 findShopPage" ,groups = ["prod","uat"],testName = "findShopPage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findShopPage(TestContext testContext){
        findShopPage.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
