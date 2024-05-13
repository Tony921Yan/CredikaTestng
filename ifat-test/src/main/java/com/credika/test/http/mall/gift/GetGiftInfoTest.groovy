package com.credika.test.http.mall.gift


import com.credika.biz.request.http.mall.gift.GetGiftInfo
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetGiftInfoTest extends BaseTest {
    GetGiftInfo getGiftInfo = new GetGiftInfo()
    @Test(description = "查询礼包 getGiftInfo" ,groups = ["prod","uat"],testName = "getGiftInfo",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getGiftInfo(TestContext testContext){
        testContext.put("giftId",1453960321826848)
        testContext.put("userId",1429851454046240)
        getGiftInfo.invoke(testContext).baseAssert(testContext)
    }
}