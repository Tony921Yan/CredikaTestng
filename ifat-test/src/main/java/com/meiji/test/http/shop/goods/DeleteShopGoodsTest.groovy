package com.meiji.test.http.shop.goods

import com.meiji.biz.request.http.shop.goods.DeleteShopGoods
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class DeleteShopGoodsTest extends BaseTest { //接口没调成功
    DeleteShopGoods deleteShopGoods = new DeleteShopGoods()
    @Test(description = "删除店铺商品(取消收藏) deleteShopGoods" ,groups = ["prod","uat"],testName = "deleteShopGoods",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void deleteShopGoods(TestContext testContext){
        deleteShopGoods.invoke(testContext).baseAssert(testContext)
    }
}
