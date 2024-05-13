package com.credika.test.http.platform.aftersalesDetailManage

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.credika.biz.request.http.platform.aftersalesDetailManage.CheckGoods
import org.testng.annotations.Test

class CheckGoodsTest extends BaseTest {
    CheckGoods checkGoods = new CheckGoods()
    @Test(description = "售后单验货-异常场景-不可验货时抛出异常 checkGoods" ,groups = ["prod","uat"],testName = "checkGoods-p",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void checkGoods(TestContext testContext){
        checkGoods.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
