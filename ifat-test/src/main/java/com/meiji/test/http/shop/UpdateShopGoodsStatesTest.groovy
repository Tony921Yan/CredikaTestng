package com.meiji.test.http.shop

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.shop.AddShopGoods
import com.meiji.request.http.shop.UpdateShopGoodsStates
import org.testng.annotations.Test

class UpdateShopGoodsStatesTest extends BaseTest {
    UpdateShopGoodsStates updateShopGoodsStates = new UpdateShopGoodsStates()
    @Test(description = "批量更新店铺商品上架状态 updateShopGoodsStates" ,groups = ["prod","uat"],testName = "updateShopGoodsStates",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateShopGoodsStates(TestContext testContext){
        updateShopGoodsStates.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
