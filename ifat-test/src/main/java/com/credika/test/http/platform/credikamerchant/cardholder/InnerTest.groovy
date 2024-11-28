package com.credika.test.http.platform.credikamerchant.cardholder
import com.credika.biz.request.http.platform.credikamerchant.cardholder.Inner
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
class InnerTest extends BaseTest {
     Inner inner = new Inner()
    @Test(description = "持卡人信息查询 inner" ,groups = ["prod","uat"],testName = "inner",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void inner(TestContext testContext){
        inner.invoke(testContext).baseAssert(testContext)
    }

}
