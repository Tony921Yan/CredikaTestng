package com.meiji.test.http.OMS.account




import com.meiji.biz.request.http.OMS.account.Query
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class QueryTest extends BaseTest {
    Query query = new Query()
    @Test(description = "银行查询 query" ,groups = ["prod","uat"],testName = "OMSquery",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void query(TestContext testContext){
        query.invoke(testContext).baseAssert(testContext)
    }
}
