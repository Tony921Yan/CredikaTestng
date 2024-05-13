package com.credika.test.http.platform.hfjy.orderManange
import com.credika.biz.request.http.platform.hfjy.orderManange.Page
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class PageTest extends BaseTest {
    Page page = new Page()
    @Test(description = "用油订单查询 page" ,groups = ["prod","uat"],testName = "page",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void page(TestContext testContext){
        testContext.put("condition","{}")
        testContext.put("page",1)
        testContext.put("rows",20)
        page.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
//        page.invoke(testContext).baseAssert(testContext)
    }
}