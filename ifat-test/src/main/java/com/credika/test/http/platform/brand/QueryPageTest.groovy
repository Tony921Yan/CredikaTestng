package com.credika.test.http.platform.brand

import com.credika.biz.request.http.platform.brand.QueryPage
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 * @author Remy*
 * @date 2022/03/11 9:55
 * @Vession update from history version
 */
class QueryPageTest extends BaseTest{
    QueryPage queryPage = new QueryPage()
    @Test(description = "品牌管理列表 queryPage",groups = ["uat","prod"],testName = "brandQueryPage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)

    public void queryPage(TestContext testContext){
        queryPage.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }

}
