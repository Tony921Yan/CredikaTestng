package com.credika.test.http.platform.credikamerchant.card
import com.credika.biz.request.http.platform.credikamerchant.crad.Unlock
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
class UnlockTest extends BaseTest {
     Unlock unlock = new Unlock()
    @Test(description = "商户解锁卡 unlock" ,groups = ["prod","uat"],testName = "unlock",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void unlock(TestContext testContext){
        unlock.invoke(testContext).baseAssert(testContext)
    }

}
