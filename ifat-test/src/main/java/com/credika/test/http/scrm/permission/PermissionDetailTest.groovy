package com.credika.test.http.scrm.permission

import com.credika.biz.request.http.scrm.permission.PermissionDetail
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/9/17-15:35
 */
class PermissionDetailTest extends BaseTest {
    PermissionDetail permission = new PermissionDetail()

    @Test(description = "权限详情", groups = ["prod", "uat"], testName = "perdetail",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        permission.invoke(testContext).specialAssert(testContext)
    }
}
