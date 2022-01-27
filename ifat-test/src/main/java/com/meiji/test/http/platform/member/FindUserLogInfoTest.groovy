package com.meiji.test.http.platform.member

import com.meiji.biz.request.http.platform.member.FindUserLogInfo
import com.meiji.biz.request.http.platform.member.FindUserOrderInfo
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class FindUserLogInfoTest extends BaseTest {
   FindUserLogInfo findUserLogInfo = new FindUserLogInfo()
    @Test(description = "查询会员资料变更 findUserLogInfo" ,groups = ["prod","uat"],testName = "findUserLogInfo",
           dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void pageLabel(TestContext testContext){
        findUserLogInfo.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
