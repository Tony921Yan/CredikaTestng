package com.credika.test.http.platform.credikamerchant.card
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
class RechargeTest extends BaseTest {
     Recharge recharge = new Recharge()
    @Test(description = "查询卡片充值记录 recharge" ,groups = ["prod","uat"],testName = "recharge",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void recharge(TestContext testContext){
        recharge.invoke(testContext).baseAssert(testContext)
    }

}
