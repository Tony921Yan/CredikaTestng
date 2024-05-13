package com.credika.test.http.platform.credikamerchant.creditlimit
import com.credika.biz.request.http.platform.credikamerchant.creditlimit.Page
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author Remy
 @create 2021/11/18-20:20
 @version v2.1
 */
class PageTest extends BaseTest {
     Page page = new Page()
    @Test(description = "商户交易记录 page" ,groups = ["prod","uat"],testName = "page",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void page(TestContext testContext){
        page.invoke(testContext).baseAssert(testContext)
    }

}
