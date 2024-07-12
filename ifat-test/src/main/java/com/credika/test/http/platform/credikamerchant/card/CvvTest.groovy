package com.credika.test.http.platform.credikamerchant.card
import com.credika.biz.request.http.platform.credikamerchant.crad.Cvv
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
class CvvTest extends BaseTest {
     Cvv cvv = new Cvv()
    @Test(description = "商户CVV查询 cvv" ,groups = ["prod","uat"],testName = "cvv",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void cvv(TestContext testContext){
        cvv.invoke(testContext).baseAssert(testContext)
    }

}
