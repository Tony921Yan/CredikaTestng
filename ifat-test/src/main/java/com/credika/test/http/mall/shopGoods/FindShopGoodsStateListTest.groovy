package com.credika.test.http.mall.shopGoods

import com.credika.biz.request.http.mall.shopGoods.FindShopGoodsStateList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class FindShopGoodsStateListTest extends BaseTest {
    FindShopGoodsStateList findShopGoodsStateList = new FindShopGoodsStateList()
    @Test(description = "查询店铺商品状态列表（购物车列表） findShopGoodsStateList" ,groups = ["prod","uat"],testName = "findShopGoodsStateList",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findShopGoodsStateList(TestContext testContext){
        findShopGoodsStateList.invoke(testContext).baseAssert(testContext)
    }
}
