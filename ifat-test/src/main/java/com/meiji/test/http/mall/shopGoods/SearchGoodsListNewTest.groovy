package com.meiji.test.http.mall.shopGoods

import com.meiji.biz.request.http.mall.shopGoods.SearchGoodsListNew
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class SearchGoodsListNewTest extends BaseTest {

    @Test(description = "新搜索商品列表 searchGoodsListNew" ,groups = ["prod","uat"],testName = "searchGoodsListNew",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void searchGoodsListNew(TestContext testContext){
        .invoke(testContext).baseAssert(testContext)
    }
}
