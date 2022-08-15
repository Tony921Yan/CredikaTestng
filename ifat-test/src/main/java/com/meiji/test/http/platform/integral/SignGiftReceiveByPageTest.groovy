package com.meiji.test.http.platform.integral
import com.meiji.biz.request.http.platform.integral.SignGiftReceiveByPage
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class SignGiftReceiveByPageTest extends BaseTest {
    SignGiftReceiveByPage signGiftReceiveByPage = new SignGiftReceiveByPage()
    @Test(description = "签到礼包领取记录查询 signGiftReceiveByPage" ,groups = ["prod","uat"],testName = "signGiftReceiveByPage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void signGiftReceiveByPage(TestContext testContext){
        signGiftReceiveByPage.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }

    SignGiftReceiveByPage signGiftReceiveByPage1 = new SignGiftReceiveByPage()
    @Test(description = "签到礼包领取记录查询-礼包类型:积分 signGiftReceiveByPage1",groups = ["prod","uat"],testName ="signGiftReceiveByPage1" ,
    dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void  signGiftReceiveByPage1(TestContext testContext){
        signGiftReceiveByPage1.invoke(testContext).baseAssert(testContext)
    }

    SignGiftReceiveByPage signGiftReceiveByPage2 = new SignGiftReceiveByPage()
    @Test(description = "签到礼包领取记录查询-礼包类型:优惠券 signGiftReceiveByPage2",groups = ["prod","uat"],testName = "signGiftReceiveByPage2",
    dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void signGiftReceiveByPage2(TestContext testContext){
        signGiftReceiveByPage2.invoke(testContext).baseAssert(testContext)
    }

    SignGiftReceiveByPage signGiftReceiveByPage3 = new SignGiftReceiveByPage()
    @Test(description = "签到礼包领取记录查询-礼包类型:兜底积分 signGiftReceiveByPage3",groups = ["prod","uat"],testName = "signGiftReceiveByPage3",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void signGiftReceiveByPage3(TestContext testContext){
        signGiftReceiveByPage3.invoke(testContext).baseAssert(testContext)
    }



}
