package com.meiji.test.http.scrm.login

import com.meiji.biz.request.http.scrm.login.Login
import com.meiji.biz.request.http.scrm.login.QrCode
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/8/20-9:45
 */
class QrCodeTest extends BaseTest {

    QrCode qrCode = new QrCode()
    @Test(description = "二维码信息接口 qrcode" ,groups = ["prod","uat"],testName = "qrcode",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        qrCode.invoke(testContext).baseAssert(testContext)
    }
}
