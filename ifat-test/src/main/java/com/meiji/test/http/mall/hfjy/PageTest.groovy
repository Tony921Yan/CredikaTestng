package com.meiji.test.http.mall.hfjy
import com.meiji.biz.request.http.mall.hfjy.Page
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class PageTest extends BaseTest {
    Page page = new Page()
    @Test(description = "用油订单列表 page" ,groups = ["prod","uat"],testName = "page",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void page(TestContext testContext){
        testContext.put("condition",'{"keyword": "","status": 0}')
        testContext.put("page",1)
        testContext.put("rows",20)
        page.invoke(testContext).baseAssert(testContext)
    }
}