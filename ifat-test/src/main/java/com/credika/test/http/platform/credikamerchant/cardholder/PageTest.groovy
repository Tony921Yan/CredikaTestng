package com.credika.test.http.platform.credikamerchant.cardholder

import com.credika.biz.request.http.platform.credikamerchant.cardholder.Page
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
    @Test(description = "商户持卡人 page" ,groups = ["prod","uat"],testName = "page",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void account(TestContext testContext){
        testContext.put("page",1)
        testContext.put("size",10)
        page.invoke(testContext).baseAssert(testContext)
    }

}
