package com.meiji.test.http.shop

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.shop.AddShopGoods
import com.meiji.request.http.shop.FindGoodsList
import org.testng.annotations.Test

class FindGoodsListTest extends BaseTest {
    FindGoodsList findGoodsList = new FindGoodsList()
    @Test(description = "查询选品商品列表 findGoodsList" ,groups = ["prod","uat"],testName = "findGoodsList",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findGoodsList(TestContext testContext){
        findGoodsList.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
