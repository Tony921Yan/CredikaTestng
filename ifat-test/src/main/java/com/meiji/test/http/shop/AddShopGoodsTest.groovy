package com.meiji.test.http.shop

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.shop.AddShopGoods
import org.testng.annotations.Test

class AddShopGoodsTest extends BaseTest {
    AddShopGoods addShopGoods = new AddShopGoods()
    @Test(description = "批量新增选品 addShopGoods" ,groups = ["prod","uat"],testName = "addShopGoods",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void addShopGoods(TestContext testContext){
        addShopGoods.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
