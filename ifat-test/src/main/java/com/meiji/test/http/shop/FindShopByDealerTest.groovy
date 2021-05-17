package com.meiji.test.http.shop

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.meiji.biz.request.http.shop.FindShopByDealer
import org.testng.annotations.Test

class FindShopByDealerTest extends BaseTest {
    FindShopByDealer findShopByDealer = new FindShopByDealer()
    @Test(description = "查询商家的店铺列表 findShopByDealer" ,groups = ["prod","uat"],testName = "findShopByDealer",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findShopByDealer(TestContext testContext){
        findShopByDealer.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
