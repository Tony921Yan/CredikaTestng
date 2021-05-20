package com.meiji.test.http.mall

import com.meiji.biz.request.http.mall.FindShopGoodsStateList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class FindShopGoodsStateListTest extends BaseTest {
    FindShopGoodsStateList findShopGoodsStateList = new FindShopGoodsStateList()
    @Test(description = "查询店铺商品状态列表 findShopGoodsStateList" ,groups = ["prod","uat"],testName = "findShopGoodsStateList",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findShopGoodsStateList(TestContext testContext){
        findShopGoodsStateList.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
