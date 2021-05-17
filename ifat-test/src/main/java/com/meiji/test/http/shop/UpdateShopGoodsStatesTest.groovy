package com.meiji.test.http.shop

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.meiji.biz.request.http.shop.UpdateShopGoodsStates
import org.testng.annotations.Test

class UpdateShopGoodsStatesTest extends BaseTest {
    UpdateShopGoodsStates updateShopGoodsStates = new UpdateShopGoodsStates()
    @Test(description = "批量更新店铺商品上架状态 updateShopGoodsStates" ,groups = ["prod","uat"],testName = "updateShopGoodsStates",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateShopGoodsStates(TestContext testContext){
        updateShopGoodsStates.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
