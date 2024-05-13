package com.credika.test.http.mall.userInfo

import com.credika.biz.request.http.mall.userInfo.GetLongUrl
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test
/**
 * @author Remy
 * * @date 2022/03/19 23:18
 * @Vession V2.6.3
 * */
class GetLongUrlTest extends BaseTest {
    GetLongUrl getLongUrl = new GetLongUrl()
    @Test(description = "抽奖-开店默认给邀请码 getLongUrl" ,groups = ["prod","uat"],testName = "getLongUrl",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getLongUrl(TestContext testContext){
        getLongUrl.invoke(testContext).baseAssert(testContext)
    }
}
