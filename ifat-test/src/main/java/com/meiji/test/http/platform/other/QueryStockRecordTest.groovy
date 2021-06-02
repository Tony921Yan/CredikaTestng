package com.meiji.test.http.platform.other

import com.meiji.biz.request.http.platform.other.QueryStockRecord
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class QueryStockRecordTest extends BaseTest {
    QueryStockRecord queryStockRecord = new QueryStockRecord()
    @Test(description = "库存出库记录管理 queryStockRecord" ,groups = ["prod","uat"],testName = "queryStockRecord",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void queryStockRecord(TestContext testContext){
        queryStockRecord.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
