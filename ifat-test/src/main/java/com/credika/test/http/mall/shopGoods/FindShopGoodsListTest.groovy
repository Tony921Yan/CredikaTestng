package com.credika.test.http.mall.shopGoods

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.credika.biz.request.http.mall.shopGoods.FindShopGoodsList
import org.testng.annotations.Test

class FindShopGoodsListTest extends BaseTest {
    FindShopGoodsList findShopGoodsList = new FindShopGoodsList() //node层修改接口地址：searchGoodsList
    @Test(description = "查询店铺商品列表 findShopGoodsList" ,groups = ["prod","uat"],testName = "findShopGoodsList",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findShopGoodsList(TestContext testContext){
        findShopGoodsList.invoke(testContext).baseAssert(testContext).specialAssert(testContext)

    }
}
