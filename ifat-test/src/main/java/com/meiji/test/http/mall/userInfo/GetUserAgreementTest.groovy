package com.meiji.test.http.mall.userInfo

import com.meiji.biz.request.http.mall.userInfo.GetUserAgreement
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetUserAgreementTest extends BaseTest { //协议改为txt，不确定当前接口是否废弃
    GetUserAgreement getUserAgreement = new GetUserAgreement()
    @Test(description = "获取用户协议 getUserAgreement" ,groups = ["prod","uat"],testName = "getUserAgreement",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getUserAgreement(TestContext testContext){
        getUserAgreement.invoke(testContext).baseAssert(testContext)
    }
}
