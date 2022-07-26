package com.meiji.test.http.OMS.aftersale

import com.meiji.biz.request.http.OMS.aftersale.CheckGoods
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class CheckGoodsTest extends BaseTest{
    CheckGoods checkGoods = new CheckGoods()
    @Test(description = "售后单验货 checkGoods" ,groups = ["prod","uat"],testName = "OMScheckGoods",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void checkGoods(TestContext testContext){
        checkGoods.invoke(testContext).baseAssert(testContext)
    }
}
