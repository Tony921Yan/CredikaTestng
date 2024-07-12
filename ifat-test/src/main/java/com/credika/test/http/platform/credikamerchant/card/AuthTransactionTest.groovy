package com.credika.test.http.platform.credikamerchant.card
import com.credika.biz.request.http.platform.credikamerchant.crad.AuthTransaction
import com.credika.biz.request.http.platform.credikamerchant.crad.Recharge
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author Remy
 @create 2021/11/18-20:20
 @version v2.1
 */
class AuthTransactionTest extends BaseTest {
     AuthTransaction authTransaction = new AuthTransaction()
    @Test(description = "查询卡片消费记录 authTransaction" ,groups = ["prod","uat"],testName = "authTransaction",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void authTransaction(TestContext testContext){
        testContext.put("page",1)
        testContext.put("size",5)
        authTransaction.invoke(testContext).baseAssert(testContext)
    }

}
