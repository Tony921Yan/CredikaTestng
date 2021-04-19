package com.meiji.test.http.goods

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.goods.UpdateGoods
import com.meiji.util.JsonUtil
import org.testng.annotations.Test

class UpdateGoodsTest extends BaseTest {
    UpdateGoods updateGoods = new UpdateGoods()
    @Test(description = "更新商品 updateGoods" ,groups = ["prod","uat"],testName = "updateGoods",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateGoods(TestContext testContext){
        testContext.put("pics", JsonUtil.objToJsonList(testContext.get("pics")))
        testContext.put("skus", JsonUtil.objToJsonList(testContext.get("skus")))
        updateGoods.invoke(testContext).baseAssert(testContext)
    }
}
