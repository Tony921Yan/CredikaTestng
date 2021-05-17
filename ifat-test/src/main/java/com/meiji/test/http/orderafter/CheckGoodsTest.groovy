package com.meiji.test.http.orderafter

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.meiji.biz.request.http.orderafter.CheckGoods
import org.testng.annotations.Test

class CheckGoodsTest extends BaseTest {
    CheckGoods checkGoods = new CheckGoods()
    @Test(description = "售后单验货 checkGoods" ,groups = ["prod","uat"],testName = "checkGoods",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void checkGoods(TestContext testContext){
        checkGoods.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
