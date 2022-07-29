package com.meiji.test.http.platform.shopManager

import com.meiji.biz.request.http.platform.shopmanager.SearchShopByNameOrId
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class SearchShopByNameOrIdTest extends BaseTest {
    SearchShopByNameOrId searchShopByNameOrId = new SearchShopByNameOrId()
    @Test(description = "推广-搜索店铺 searchShopByNameOrId" ,groups = ["prod","uat"],testName = "searchShopByNameOrId",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    void searchShopByNameOrId(TestContext testContext){
        searchShopByNameOrId.invoke(testContext).baseAssert(testContext)
//        searchShopByNameOrId.specialAssert(testContext)
    }

}
