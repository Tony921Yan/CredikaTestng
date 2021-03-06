package com.meiji.test.http.goods

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.api.goods.AddGoods
import com.meiji.util.JsonUtil
import org.testng.annotations.Test

class AddGoddsTest extends BaseTest {
    AddGoods addGoods = new AddGoods()
    @Test(description = "添加商品 addGoods" ,groups = ["prod","uat"],testName = "addGoods",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void addGoods(TestContext testContext){
        testContext.put("pics", JsonUtil.objToJsonList(testContext.get("pics")))
        testContext.put("skus", JsonUtil.objToJsonList(testContext.get("skus")))
        addGoods.invoke(testContext).baseAssert(testContext)
    }
}
