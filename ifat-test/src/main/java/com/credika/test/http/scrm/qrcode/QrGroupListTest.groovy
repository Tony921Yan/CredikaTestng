package com.credika.test.http.scrm.qrcode

import com.credika.biz.request.http.scrm.qrcode.QrGroupList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/9/18-14:29
 */
class QrGroupListTest extends BaseTest {
    QrGroupList qr = new QrGroupList()

    @Test(description = "群活码列表", groups = ["prod", "uat"], testName = "qrlist",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        qr.invoke(testContext).baseAssert(testContext)
    }
}
