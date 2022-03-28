package com.meiji.test.http.platform.stockManger
import com.meiji.biz.request.http.platform.stockManger.QueryAllotBillDetail
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class QueryAllotBillDetailTest extends BaseTest {
    QueryAllotBillDetail queryAllotBillDetail = new QueryAllotBillDetail()
    @Test(description = "调拨单明细查询,queryAllotBillDetail ", groups = ["prod", "uat"], testName = "queryAllotBillDetail",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void queryAllotBillDetail(TestContext testContext) {
        queryAllotBillDetail.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}


