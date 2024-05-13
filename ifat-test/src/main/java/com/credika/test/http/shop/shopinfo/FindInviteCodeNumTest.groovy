package com.credika.test.http.shop.shopinfo

import com.credika.biz.request.http.shop.shopinfo.FindInviteCodeNum
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class FindInviteCodeNumTest extends BaseTest {
    FindInviteCodeNum findInviteCodeNum = new FindInviteCodeNum()
    @Test(description = "查询邀请码数量 findInviteCodeNum" ,groups = ["prod","uat"],testName = "findInviteCodeNum",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findInviteCodeNum(TestContext testContext){
        findInviteCodeNum.invoke(testContext).baseAssert(testContext)
    }
}
