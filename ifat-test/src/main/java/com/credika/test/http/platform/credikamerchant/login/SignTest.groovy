package com.credika.test.http.platform.credikamerchant.login
import com.credika.biz.request.http.platform.credikamerchant.crad.Page
import com.credika.biz.request.http.platform.credikamerchant.login.Sign
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
class SignTest extends BaseTest {
     Sign sign = new Sign()
    @Test(description = "商户登陆 sign" ,groups = ["prod","uat"],testName = "sign",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void sign(TestContext testContext){
        testContext.put("username",'master@credkink.ai')
        testContext.put("password",'10000ntjzzzx@gmail.com')
        sign.invoke(testContext).baseAssert(testContext)
    }

}
