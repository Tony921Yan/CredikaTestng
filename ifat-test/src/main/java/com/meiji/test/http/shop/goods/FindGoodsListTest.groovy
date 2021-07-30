package com.meiji.test.http.shop.goods

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.meiji.biz.request.http.shop.goods.FindGoodsList
import org.testng.annotations.Test

class FindGoodsListTest extends BaseTest {
    FindGoodsList findGoodsList = new FindGoodsList()
    @Test(description = "查询选品商品列表 findGoodsList" ,groups = ["prod","uat"],testName = "findGoodsList",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findGoodsList(TestContext testContext){
        findGoodsList.invoke(testContext).baseAssert(testContext)
    }
}
