package com.meiji.test.http.shop

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.shop.AddShopGoods
import com.meiji.request.http.shop.FindShopByDealer
import org.testng.annotations.Test

class FindShopByDealerTest extends BaseTest {
    FindShopByDealer findShopByDealer = new FindShopByDealer()
    @Test(description = "查询商家的店铺列表 findShopByDealer" ,groups = ["prod","uat"],testName = "findShopByDealer",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findShopByDealer(TestContext testContext){
        findShopByDealer.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
