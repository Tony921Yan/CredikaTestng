package com.meiji.test.api.goods


import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.miyuan.ifat.support.util.JsonUtil
import org.testng.annotations.Test

class AddGoddsTest extends BaseTest {
    com.meiji.biz.request.api.goods.AddGoods addGoods = new com.meiji.biz.request.api.goods.AddGoods()
    @Test(description = "添加商品 addGoods" ,groups = ["prod","uat"],testName = "addGoods",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void addGoods(TestContext testContext){
        testContext.put("pics", JsonUtil.objToJsonList(testContext.get("pics")))
        testContext.put("skus", JsonUtil.objToJsonList(testContext.get("skus")))
        addGoods.invoke(testContext).baseAssert(testContext)
    }
}
