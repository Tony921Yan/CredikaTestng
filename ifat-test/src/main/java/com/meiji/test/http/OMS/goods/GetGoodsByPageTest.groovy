package com.meiji.test.http.OMS.goods


import com.meiji.biz.request.http.OMS.goods.GetGoodsByPage
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetGoodsByPageTest extends BaseTest {

    GetGoodsByPage GetGoodsByPage = new GetGoodsByPage()
    @Test(description = "获取商品信息 GetGoodsByPage" ,groups = ["prod","uat"],testName = "OMSGetGoodsByPage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    void GetGoodsByPage(TestContext testContext){
        GetGoodsByPage.invoke(testContext).baseAssert(testContext)
    }
}

