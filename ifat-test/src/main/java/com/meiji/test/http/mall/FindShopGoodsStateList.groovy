package com.meiji.test.http.mall

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.mall.FindShopGoodsStateList
import org.testng.annotations.Test

class FindShopGoodsStateListTest extends BaseTest {
    FindShopGoodsStateList findShopGoodsStateList = new FindShopGoodsStateList()
    @Test(description = "查询店铺商品状态列表 findShopGoodsStateList" ,groups = ["prod","uat"],testName = "findShopGoodsStateList",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findShopGoodsStateList(TestContext testContext){
        findShopGoodsStateList.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
