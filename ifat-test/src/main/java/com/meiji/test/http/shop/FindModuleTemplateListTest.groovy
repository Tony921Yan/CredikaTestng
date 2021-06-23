package com.meiji.test.http.shop

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.meiji.biz.request.http.shop.FindModuleTemplateList
import org.testng.annotations.Test

class FindModuleTemplateListTest extends BaseTest {
    FindModuleTemplateList findModuleTemplateList = new FindModuleTemplateList()
    @Test(description = "查询店铺首页模块模板列表 findModuleTemplateList" ,groups = ["prod","uat"],testName = "findModuleTemplateList",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findModuleTemplateList(TestContext testContext){
        findModuleTemplateList.invoke(testContext).baseAssert(testContext)
    }
}
