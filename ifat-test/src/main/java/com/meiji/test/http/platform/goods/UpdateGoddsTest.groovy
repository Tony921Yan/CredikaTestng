package com.meiji.test.http.platform.goods

import com.meiji.biz.request.http.platform.goods.AddGoods
import com.meiji.biz.request.http.platform.goods.UpdateGoods
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.miyuan.ifat.support.util.JsonUtil
import org.testng.annotations.Test

class UpdateGoodsTest extends BaseTest {
    UpdateGoods updateGoods = new UpdateGoods()
    @Test(description = "更新商品 updateGoods" ,groups = ["prod","uat"],testName = "updateGoods",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateGoods(TestContext testContext){
        //testContext.put("pics", JsonUtil.objToJsonList(testContext.get("pics")))
        //testContext.put("skus", JsonUtil.objToJsonList(testContext.get("skus")))
        updateGoods.invoke(testContext).baseAssert(testContext)
    }
}
