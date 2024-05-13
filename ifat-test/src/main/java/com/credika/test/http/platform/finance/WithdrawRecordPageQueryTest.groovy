package com.credika.test.http.platform.finance


import com.credika.biz.request.http.platform.finance.WithdrawRecordPageQuery
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class WithdrawRecordPageQueryTest extends BaseTest {
    WithdrawRecordPageQuery withdrawRecordPageQuery = new WithdrawRecordPageQuery()
    @Test(description = "提现记录分页查询 withdrawRecordPageQuery" ,groups = ["prod","uat"],testName = "withdrawRecordPageQuery_platform",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void withdrawRecordPageQuery(TestContext testContext){
        withdrawRecordPageQuery.invoke(testContext).baseAssert(testContext)
    }
}
