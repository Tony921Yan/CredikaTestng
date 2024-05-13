package com.credika.test.http.scrm.role

import com.credika.biz.request.http.scrm.role.RoleList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/8/20-15:41
 */
class RoleListTest extends BaseTest{

    RoleList roleList = new RoleList()
    @Test(description = "角色列表 rolelist", groups = ["prod", "uat"], testName = "rolelist",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        roleList.invoke(testContext).baseAssert(testContext)
    }
}
