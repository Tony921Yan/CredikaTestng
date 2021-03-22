package com.meiji.test.http.shop

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.shop.AddShopGoods
import com.meiji.request.http.shop.FindModuleTemplateList
import org.testng.annotations.Test

class FindModuleTemplateListTest extends BaseTest {
    FindModuleTemplateList findModuleTemplateList = new FindModuleTemplateList()
    @Test(description = "查询店铺首页模块模板列表 findModuleTemplateList" ,groups = ["prod","uat"],testName = "findModuleTemplateList",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findModuleTemplateList(TestContext testContext){
        findModuleTemplateList.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
