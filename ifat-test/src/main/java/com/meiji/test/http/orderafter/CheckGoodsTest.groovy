package com.meiji.test.http.orderafter

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.orderafter.Cancel
import com.meiji.request.http.orderafter.CheckGoods
import org.testng.annotations.Test

class CheckGoodsTest extends BaseTest {
    CheckGoods checkGoods = new CheckGoods()
    @Test(description = "售后单验货 checkGoods" ,groups = ["prod","uat"],testName = "checkGoods",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void checkGoods(TestContext testContext){
        checkGoods.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
