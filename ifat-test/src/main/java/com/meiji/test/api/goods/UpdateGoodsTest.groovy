package com.meiji.test.api.goods

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.api.goods.UpdateGoods
import com.meiji.util.JsonUtil
import org.testng.annotations.Test

class UpdateGoodsTest extends BaseTest {
    UpdateGoods updateGoodsTest = new UpdateGoods()
    @Test(description = "更新商品 updateGoods" ,groups = ["prod","uat"],testName = "updateGoods",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateGoodsTest(TestContext testContext){
        testContext.put("pics", JsonUtil.objToJsonList(testContext.get("pics")))
        testContext.put("skus", JsonUtil.objToJsonList(testContext.get("skus")))
        updateGoodsTest.invoke(testContext).baseAssert(testContext)
    }
}
