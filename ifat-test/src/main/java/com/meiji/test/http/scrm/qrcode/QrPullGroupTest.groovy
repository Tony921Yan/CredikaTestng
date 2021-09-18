package com.meiji.test.http.scrm.qrcode

import com.meiji.biz.request.http.scrm.qrcode.QrPullGroup
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/9/18-14:33
 */
class QrPullGroupTest extends BaseTest {
    QrPullGroup qr = new QrPullGroup()

    @Test(description = "新建拉群", groups = ["prod", "uat"], testName = "qrpullgroup",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        qr.invoke(testContext).baseAssert(testContext)
    }
}
