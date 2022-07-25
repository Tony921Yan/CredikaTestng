package com.meiji.test.http.OMS.account
import com.meiji.biz.request.http.OMS.account.WithdrawRecordPageQuery
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class WithdrawRecordPageQueryTest extends BaseTest {
    WithdrawRecordPageQuery withdrawRecordPageQuery = new WithdrawRecordPageQuery()
    @Test(description = "提现记录分页查询 withdrawRecordPageQuery" ,groups = ["prod","uat"],testName = "OMSwithdrawRecordPageQuery",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void withdrawRecordPageQuery(TestContext testContext){
        withdrawRecordPageQuery.invoke(testContext).baseAssert(testContext)
    }
}
