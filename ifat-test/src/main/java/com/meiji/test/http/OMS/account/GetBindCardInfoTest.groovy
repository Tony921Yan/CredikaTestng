package com.meiji.test.http.OMS.account

import com.meiji.biz.request.http.OMS.account.GetBindCardInfo
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetBindCardInfoTest extends BaseTest {
    GetBindCardInfo getBindCardInfo = new GetBindCardInfo()
    @Test(description = "获取供应商账户信息 getBindCardInfo" ,groups = ["prod","uat"],testName = "OMSgetBindCardInfo",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getBindCardInfo(TestContext testContext){
        getBindCardInfo.invoke(testContext).baseAssert(testContext)
    }
}
