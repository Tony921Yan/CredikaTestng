package com.credika.test.http.scrm.employee

import com.credika.biz.request.http.scrm.employee.Show
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/8/23-16:00
 */
class ShowTest extends BaseTest {
    Show show = new Show()

    @Test(description = "查看成员详情基础信息", groups = ["prod", "uat"], testName = "empshow",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        show.invoke(testContext).baseAssert(testContext)
    }
}
