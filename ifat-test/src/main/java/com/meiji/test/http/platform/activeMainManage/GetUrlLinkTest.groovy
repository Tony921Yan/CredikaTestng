package com.meiji.test.http.platform.activeMainManage

import com.meiji.biz.request.http.platform.activeMainManage.GetUrlLink
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetUrlLinkTest extends BaseTest{
    GetUrlLink getUrlLink = new GetUrlLink()
    @Test(description = "推广-获取urllink" ,groups = ["prod","uat"],testName = "getUrlLink",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    void searchShopByNameOrId(TestContext testContext){
        getUrlLink.invoke(testContext).baseAssert(testContext)
//        getUrlLink.specialAssert(testContext)
    }
}
