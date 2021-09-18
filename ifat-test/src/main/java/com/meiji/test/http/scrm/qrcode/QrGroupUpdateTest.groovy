package com.meiji.test.http.scrm.qrcode

import com.meiji.biz.request.http.scrm.qrcode.QrGroupUpdate
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/9/18-14:39
 */
class QrGroupUpdateTest extends BaseTest {
    QrGroupUpdate qr = new QrGroupUpdate()

    @Test(description = "修改群活码", groups = ["prod", "uat"], testName = "qrupdate",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        qr.invoke(testContext).baseAssert(testContext)
    }
}
