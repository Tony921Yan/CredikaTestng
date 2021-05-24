package com.meiji.test.http.platform.goods

import com.meiji.biz.request.http.platform.goods.AddSubmitGoods
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.miyuan.ifat.support.util.JsonUtil
import org.testng.annotations.Test

class AddSubmitGoodsTest extends BaseTest {
    AddSubmitGoods addSubmitGoods = new AddSubmitGoods()
    @Test(description = "新增提交商品 addSubmitGoods" ,groups = ["prod","uat"],testName = "addSubmitGoods",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void addSubmitGoods(TestContext testContext){
        testContext.put("pics", JsonUtil.objToJsonList(testContext.get("pics")))
        testContext.put("skus", JsonUtil.objToJsonList(testContext.get("skus")))
        addSubmitGoods.invoke(testContext).baseAssert(testContext)
    }
}
