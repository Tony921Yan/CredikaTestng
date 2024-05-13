package com.credika.test.api.brand

import com.credika.biz.request.api.brand.SelectPage
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class SelectPageTest extends BaseTest {
    SelectPage selectPage = new SelectPage()
    @Test(description = "商品属性组分页查询 selectPage" ,groups = ["prod","uat"],testName = "selectPage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void selectPage(TestContext testContext){
        selectPage.invoke(testContext).baseAssert(testContext)
    }
}
