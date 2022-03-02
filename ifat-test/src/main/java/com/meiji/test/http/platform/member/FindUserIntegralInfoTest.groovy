package com.meiji.test.http.platform.member

import com.meiji.biz.request.http.platform.member.FindUserAddressInfo
import com.meiji.biz.request.http.platform.member.FindUserIntegralInfo
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test


class FindUserIntegralInfoTest extends BaseTest {
    FindUserIntegralInfo findUserIntegralInfo = new FindUserIntegralInfo()
    @Test(description = "查询会员积分信息 findUserIntegralInfo" ,groups = ["prod","uat"],testName = "findUserIntegralInfo",
           dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void pageLabel(TestContext testContext){
        findUserIntegralInfo.invoke(testContext).baseAssert(testContext).specialAssert(testContext)}
}