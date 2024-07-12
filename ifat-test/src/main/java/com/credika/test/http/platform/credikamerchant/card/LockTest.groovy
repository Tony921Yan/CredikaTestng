package com.credika.test.http.platform.credikamerchant.card
import com.credika.biz.request.http.platform.credikamerchant.crad.Lock
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
class LockTest extends BaseTest {
     Lock lock = new Lock()
    @Test(description = "商户锁卡 lock" ,groups = ["prod","uat"],testName = "lock",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void lock(TestContext testContext){
        lock.invoke(testContext).baseAssert(testContext)
    }

}
