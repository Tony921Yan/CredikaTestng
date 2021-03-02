package com.meiji.test.api.brand

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.api.brand.SelectPage
import org.testng.annotations.Test

class SelectPageTest extends BaseTest {
    SelectPage selectPage = new SelectPage()
    @Test(description = "商品属性组分页查询 selectPage" ,groups = ["prod","uat"],testName = "selectPage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void selectPage(TestContext testContext){
        selectPage.invoke(testContext).baseAssert(testContext)
    }
}
