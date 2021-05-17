package com.meiji.test.http.mall


import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class FindShopModuleListTest extends BaseTest {
    com.meiji.biz.request.http.mall.FindShopModuleList findShopModuleList = new com.meiji.biz.request.http.mall.FindShopModuleList()
    @Test(description = "查询店铺首页模块列表 findShopModuleList" ,groups = ["prod","uat"],testName = "findShopModuleList",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findShopModuleList(TestContext testContext){
        findShopModuleList.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
