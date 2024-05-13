package com.credika.test.http.mall.userInfo

import com.credika.biz.request.http.mall.userInfo.WxCheck
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class WxCheckTest extends BaseTest {
    WxCheck wxCheck = new WxCheck()
    @Test(description = "C端登录查询 wxCheck" ,groups = ["prod","uat"],testName = "wxCheck",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void wxCheck(TestContext testContext){
        wxCheck.invoke(testContext).baseAssert(testContext)
    }
}
