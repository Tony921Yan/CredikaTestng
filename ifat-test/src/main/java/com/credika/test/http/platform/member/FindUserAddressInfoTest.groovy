package com.credika.test.http.platform.member

import com.credika.biz.request.http.platform.member.FindUserAddressInfo
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class FindUserAddressInfoTest extends BaseTest {
    FindUserAddressInfo findUserAddressInfo = new FindUserAddressInfo()
    @Test(description = "查询会员地址 findUserAddressInfo" ,groups = ["prod","uat"],testName = "findUserAddressInfo",
           dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void pageLabel(TestContext testContext){
        findUserAddressInfo.invoke(testContext).baseAssert(testContext)
    }
}
