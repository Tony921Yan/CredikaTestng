package com.credika.test.http.shop.goods

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.credika.biz.request.http.shop.goods.UpdateShopGoodsStates
import org.testng.annotations.Test

class UpdateShopGoodsStatesTest extends BaseTest {
    UpdateShopGoodsStates updateShopGoodsStates = new UpdateShopGoodsStates()
    @Test(description = "批量更新店铺商品上架状态 updateShopGoodsStates" ,groups = ["prod","uat"],testName = "updateShopGoodsStates",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateShopGoodsStates(TestContext testContext){
        updateShopGoodsStates.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
