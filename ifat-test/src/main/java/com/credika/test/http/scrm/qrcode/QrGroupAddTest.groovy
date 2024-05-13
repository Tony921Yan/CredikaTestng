package com.credika.test.http.scrm.qrcode

import com.credika.biz.request.http.scrm.qrcode.QrGroupAdd
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/9/18-14:19
 */
class QrGroupAddTest extends BaseTest {
    QrGroupAdd qr = new QrGroupAdd()

    @Test(description = "新建群活码", groups = ["prod", "uat"], testName = "qradd",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        qr.invoke(testContext).baseAssert(testContext)
    }
}
