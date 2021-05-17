package com.meiji.test.api.brand


import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class SelectPageTest extends BaseTest {
    com.meiji.biz.request.api.brand.SelectPage selectPage = new com.meiji.biz.request.api.brand.SelectPage()
    @Test(description = "商品属性组分页查询 selectPage" ,groups = ["prod","uat"],testName = "selectPage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void selectPage(TestContext testContext){
        selectPage.invoke(testContext).baseAssert(testContext)
    }
}
