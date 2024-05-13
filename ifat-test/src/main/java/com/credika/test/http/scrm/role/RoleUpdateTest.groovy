package com.credika.test.http.scrm.role

import com.credika.biz.request.http.scrm.role.RoleUpdate
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/9/18-16:16
 */
class RoleUpdateTest extends BaseTest {
    RoleUpdate role = new RoleUpdate()

    @Test(description = "修改角色", groups = ["prod", "uat"], testName = "roleupdate",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        role.invoke(testContext).baseAssert(testContext)
    }
}
