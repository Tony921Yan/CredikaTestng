package com.meiji.test.http.platform.goods

import com.meiji.biz.request.http.platform.goods.AddGoods
import com.meiji.biz.request.http.platform.goods.SubmitGoods
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.miyuan.ifat.support.util.JsonUtil
import org.testng.annotations.Test

class SubmitGoodsTest extends BaseTest {
    SubmitGoods submitGoods = new SubmitGoods()
    @Test(description = "提交商品 submitGoods" ,groups = ["prod","uat"],testName = "submitGoods",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void submitGoods(TestContext testContext){
        testContext.put("pics", JsonUtil.objToJsonList(testContext.get("pics")))
        testContext.put("skus", JsonUtil.objToJsonList(testContext.get("skus")))
        submitGoods.invoke(testContext).baseAssert(testContext)
    }
}
