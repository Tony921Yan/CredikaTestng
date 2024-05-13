package com.credika.test.http.platform.activeMainManage.giftManage
import com.credika.biz.request.http.platform.activeMainManage.giftManage.QueryCircleList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class QueryCircleListTest extends BaseTest {
    QueryCircleList queryCircleList = new QueryCircleList()
    @Test(description = "送礼管理-分类管理-分类详情：圈子列表 queryCircleList" ,groups = ["prod","uat"],testName = "queryCircleList",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void queryCircleList(TestContext testContext){
        queryCircleList.invoke(testContext).baseAssert(testContext)
    }
}