package com.credika.test.http.platform.member

import com.credika.biz.request.http.platform.member.FindUserOrderInfo
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class FindUserOrderInfoTest extends BaseTest {
    FindUserOrderInfo findUserOrderInfo = new FindUserOrderInfo()
    @Test(description = "查询会员订单信息 findUserOrderInfo" ,groups = ["prod","uat"],testName = "findUserOrderInfo",
           dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void pageLabel(TestContext testContext){
        findUserOrderInfo.invoke(testContext).baseAssert(testContext)
    }
}
