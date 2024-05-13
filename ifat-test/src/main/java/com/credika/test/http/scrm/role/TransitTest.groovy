package com.credika.test.http.scrm.role

import com.credika.biz.request.http.scrm.role.Transit
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/9/18-16:12
 */
class TransitTest extends BaseTest {
    Transit transit = new Transit()

    @Test(description = "启用/禁用角色", groups = ["prod", "uat"], testName = "transit",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        transit.invoke(testContext).baseAssert(testContext)
    }
}
