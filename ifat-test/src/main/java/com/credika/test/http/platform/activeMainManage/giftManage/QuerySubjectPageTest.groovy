package com.credika.test.http.platform.activeMainManage.giftManage
import com.credika.biz.request.http.platform.activeMainManage.giftManage.QuerySubjectPage
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class QuerySubjectPageTest extends BaseTest {
    QuerySubjectPage querySubjectPage = new QuerySubjectPage()
    @Test(description = "送礼管理-分类管理-分类详情：话题列表 querySubjectPage" ,groups = ["prod","uat"],testName = "querySubjectPage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void querySubjectPage(TestContext testContext){
        querySubjectPage.invoke(testContext).baseAssert(testContext)
    }
}