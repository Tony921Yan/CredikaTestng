package com.meiji.test.http.shop.shopauth


import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class FindShopBusinessInfoTest extends BaseTest {
    com.meiji.biz.request.http.shop.shopauth.FindShopBusinessInfo findShopBusinessInfo = new com.meiji.biz.request.http.shop.shopauth.FindShopBusinessInfo()
    @Test(description = "查询店铺营业信息 findShopBusinessInfo" ,groups = ["prod","uat"],testName = "findShopBusinessInfo",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findShopBusinessInfo(TestContext testContext){
        findShopBusinessInfo.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
