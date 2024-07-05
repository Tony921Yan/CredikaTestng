package com.credika.test.http.platform.credikamerchant.cardholder
import com.credika.biz.request.http.platform.credikamerchant.cardholder.Status
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
class StatusTest extends BaseTest {
     Status status = new Status()
    @Test(description = "持卡人状态查询 status" ,groups = ["prod","uat"],testName = "status",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void status(TestContext testContext){
        status.invoke(testContext).baseAssert(testContext)
    }

}
