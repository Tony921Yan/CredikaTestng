package com.credika.test.http.scrm.role

import com.credika.biz.request.http.scrm.role.RoleDetail
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/8/20-15:37
 */
class RoleDetailTest extends BaseTest{

    RoleDetail roleDetail = new RoleDetail()

    @Test(description = "角色详情 roledetail", groups = ["prod", "uat"], testName = "roledetail",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        roleDetail.invoke(testContext).baseAssert(testContext)
    }
}
