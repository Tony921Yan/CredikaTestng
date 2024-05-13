package com.credika.test.http.scrm.employee

import com.credika.biz.request.http.scrm.employee.ShopPermissionList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/8/23-15:45
 */
class ShopPermissionListTest extends BaseTest {
    ShopPermissionList shopPermissionList = new ShopPermissionList()

    @Test(description = "查询员工访问门店权限", groups = ["prod", "uat"], testName = "shopPermissionList",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        shopPermissionList.invoke(testContext).baseAssert(testContext)
    }
}
