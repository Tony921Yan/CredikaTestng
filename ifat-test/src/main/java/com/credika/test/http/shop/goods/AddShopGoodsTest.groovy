package com.credika.test.http.shop.goods

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.credika.biz.request.http.shop.goods.AddShopGoods
import org.testng.annotations.Test

class AddShopGoodsTest extends BaseTest {
    AddShopGoods addShopGoods = new AddShopGoods()
    @Test(description = "批量新增选品 addShopGoods" ,groups = ["prod","uat"],testName = "addShopGoods",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void addShopGoods(TestContext testContext){
        addShopGoods.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
