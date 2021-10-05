package com.meiji.test.http.mall.userInfo

import com.meiji.biz.request.http.mall.userInfo.GetGiftDetailToMe
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetGiftDetailToMeTest extends BaseTest {
    GetGiftDetailToMe getGiftDetailToMe = new GetGiftDetailToMe()
    @Test(description = "赠礼详情-领取详情 getGiftDetailToMe" ,groups = ["prod","uat"],testName = "getGiftDetailToMe",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getGiftDetailToMe(TestContext testContext){
        testContext.put("giftId",1435614534696993)
        getGiftDetailToMe.invoke(testContext).baseAssert(testContext)
    }
}
