package com.meiji.test.http.mall.userInfo

import com.meiji.biz.request.http.mall.userInfo.GetGiftDetailFromMe
import com.meiji.biz.request.http.mall.userInfo.GetGiftInfo
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetGiftInfoTest extends BaseTest {
    GetGiftInfo getGiftInfo = new GetGiftInfo()
    @Test(description = "查询礼包 getGiftInfo" ,groups = ["prod","uat"],testName = "getGiftInfo",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getGiftInfo(TestContext testContext){
        testContext.put("giftId",1452895557910560)
        testContext.put("userId",1429851454046240)
        getGiftInfo.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}