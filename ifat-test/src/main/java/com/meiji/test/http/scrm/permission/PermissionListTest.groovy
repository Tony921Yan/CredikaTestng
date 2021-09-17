package com.meiji.test.http.scrm.permission

import com.meiji.biz.request.http.scrm.permission.PermissionList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/9/17-15:39
 */
class PermissionListTest extends BaseTest {
    PermissionList list = new PermissionList()

    @Test(description = "权限列表", groups = ["prod", "uat"], testName = "perlist",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        list.invoke(testContext).baseAssert(testContext)
    }
}
