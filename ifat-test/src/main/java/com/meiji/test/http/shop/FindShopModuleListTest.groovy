package com.meiji.test.http.shop

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.shop.AddShopGoods
import com.meiji.request.http.shop.FindModuleTemplateList
import com.meiji.request.http.shop.FindShopModuleList
import org.testng.annotations.Test

class FindShopModuleListTest extends BaseTest {
    FindShopModuleList findShopModuleList = new FindShopModuleList()
    @Test(description = "查询店铺首页模块列表 findShopModuleList" ,groups = ["prod","uat"],testName = "findShopModuleList",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findShopModuleList(TestContext testContext){
        findShopModuleList.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
