package com.meiji.test.http.scrm.qrcode

import com.meiji.biz.request.http.scrm.qrcode.QrGroupDetail
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/9/18-14:26
 */
class QrGoupDetailTest extends BaseTest {
    QrGroupDetail qr = new QrGroupDetail()

    @Test(description = "群活码详情", groups = ["prod", "uat"], testName = "qrgroupdetail",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        qr.invoke(testContext).baseAssert(testContext)
    }
}
