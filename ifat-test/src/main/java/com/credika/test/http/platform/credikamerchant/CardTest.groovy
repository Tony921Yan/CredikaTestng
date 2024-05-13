package com.credika.test.http.platform.credikamerchant
import com.credika.biz.request.http.platform.credikamerchant.Card
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
class CardTest extends BaseTest {
    Card card = new Card()
    @Test(description = "商户开卡 card" ,groups = ["prod","uat"],testName = "card",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void card(TestContext testContext){
        testContext.put("cardLimit",1000)
        testContext.put("cardTemplateId",1770728030451318786)
        testContext.put("holderName",'Liu')
        testContext.put("maxAuthAmount",500)
        testContext.put("otpCode",817033)
        card.invoke(testContext).baseAssert(testContext)
    }

}
