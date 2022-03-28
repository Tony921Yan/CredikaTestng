package com.meiji.test.http.platform.stockManger
import com.meiji.biz.request.http.platform.stockManger.QueryActivitiesByType
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class QueryActivitiesByTypeTest extends BaseTest {
    QueryActivitiesByType queryActivitiesByType = new QueryActivitiesByType()
    @Test(description = "查询划拨对象 queryActivitiesByType" ,groups = ["prod","uat"],testName = "queryActivitiesByType",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void queryActivitiesByType(TestContext testContext){
        queryActivitiesByType.invoke(testContext).baseAssert(testContext)
    }
}
