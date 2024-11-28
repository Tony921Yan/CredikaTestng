package com.credika.test.http.platform.credikamerchant.cardholder
import com.credika.biz.request.http.platform.credikamerchant.cardholder.Page
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author Remy
 @create 2024/08/28-20:20
 @version v2.1
 */
class PageTest extends BaseTest {
     Page page = new Page()
    @Test(description = "商户持卡人查询-非空全局查询 page01" ,groups = ["prod","uat"],testName = "page01",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void page01(TestContext testContext){
        testContext.put("page",1)
        testContext.put("size",10)
        page.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "商户持卡人查询-精确查询 page02" ,groups = ["prod","uat"],testName = "page02",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void page02(TestContext testContext){
        testContext.put("page",1)
        testContext.put("size",10)
        testContext.put("firstname",'tony')
        testContext.put("lastname",'yan')
        page.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "商户持卡人查询-非法查询 page03" ,groups = ["prod","uat"],testName = "page03",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void page03(TestContext testContext){
        testContext.put("page",1)
        testContext.put("size",10)
        testContext.put("firstname",'tony！！！')
        testContext.put("lastname",'yan@')
        page.invoke(testContext).baseAssert(testContext)
    }

}
