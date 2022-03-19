package com.meiji.test.http.platform.goods

import com.meiji.biz.request.http.platform.goods.SubmitGoods
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class SubmitGoodsTest extends BaseTest {
    SubmitGoods submitGoods = new SubmitGoods()
    @Test(description = "提交商品 submitGoods" ,groups = ["prod","uat"],testName = "submitGoods",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void submitGoods(TestContext testContext){
        submitGoods.invoke(testContext).baseAssert(testContext)
    }
}
