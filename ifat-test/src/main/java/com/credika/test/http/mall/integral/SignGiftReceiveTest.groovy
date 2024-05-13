package com.credika.test.http.mall.integral
import com.credika.biz.request.http.mall.integral.SignGiftReceive
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class SignGiftReceiveTest extends BaseTest{
    SignGiftReceive signGiftReceive = new SignGiftReceive()
    @Test(description = "用户礼包领取 signGiftReceive" ,groups = ["prod","uat"],testName = "signGiftReceive",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void signGiftReceive(TestContext testContext){
        signGiftReceive.invoke(testContext).baseAssert(testContext)
    }
}
