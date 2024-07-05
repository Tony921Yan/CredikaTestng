package com.credika.test.http.platform.credikamerchant.cardholder
import com.credika.biz.request.http.platform.credikamerchant.cardholder.Update
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
class UpdateTest extends BaseTest {
     Update update = new Update()
    @Test(description = "编辑持卡人 update" ,groups = ["prod","uat"],testName = "update",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void update(TestContext testContext){
        testContext.put("address",'深圳市罗湖区南湖街道阳光新干线家园A')
        testContext.put("birthDate",'1994-09-21')
        testContext.put("city",'深圳')
        testContext.put("contactNumber",15220252340)
        testContext.put("country",'China')
        testContext.put("countryCode",'CN')
        testContext.put("gender",'male')
        testContext.put("postCode",'518000')
        testContext.put("state",'广东')
        update.invoke(testContext).baseAssert(testContext)
    }

}
