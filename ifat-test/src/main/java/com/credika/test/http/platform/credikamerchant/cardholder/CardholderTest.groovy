package com.credika.test.http.platform.credikamerchant.cardholder
import com.credika.biz.request.http.platform.credikamerchant.cardholder.Cardholder
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
class CardholderTest extends BaseTest {
     Cardholder cardholder = new Cardholder()
    @Test(description = "新增持卡人 cardholder" ,groups = ["prod","uat"],testName = "cardholder1",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void cardholder1(TestContext testContext){
        cardholder.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "新增持卡人 cardholder" ,groups = ["prod","uat"],testName = "cardholder2",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void cardholder2(TestContext testContext){
        cardholder.invoke(testContext).baseAssert(testContext)
    }

}
