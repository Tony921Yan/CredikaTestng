package com.meiji.test.http.platform.hfjy.orderManange
import com.meiji.biz.request.http.platform.hfjy.orderManange.SelectPage
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class SelectPageTest extends BaseTest {
    SelectPage selectPage = new SelectPage()
    @Test(description = "转配订单查询 page" ,groups = ["prod","uat"],testName = "selectPage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void selectPage(TestContext testContext){
        testContext.put("condition","{}")
        testContext.put("page",1)
        testContext.put("rows",20)
        selectPage.invoke(testContext).baseAssert(testContext)
    }
}