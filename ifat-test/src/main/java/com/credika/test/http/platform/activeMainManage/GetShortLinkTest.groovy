package com.credika.test.http.platform.activeMainManage

import com.credika.biz.request.http.platform.activeMainManage.GetShortLink
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetShortLinkTest extends BaseTest{
    GetShortLink getShortLink = new GetShortLink()
    @Test(description = "推广-获取小程序 ShortLink" ,groups = ["prod","uat"],testName = "getShortLink",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    void searchShopByNameOrId(TestContext testContext){
        getShortLink.invoke(testContext).baseAssert(testContext)
//        getShortLink.specialAssert(testContext)
    }
}
