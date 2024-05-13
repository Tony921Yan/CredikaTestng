package com.credika.test.http.platform.shopManager


import com.credika.biz.request.http.platform.shopmanager.FindDealerPage
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class FindDealerPageTest extends BaseTest {
    FindDealerPage findDealerPage = new FindDealerPage()
    @Test(description = "查询商家分页 findDealerPage" ,groups = ["prod","uat"],testName = "findDealerPage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findDealerPage(TestContext testContext){
        findDealerPage.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
