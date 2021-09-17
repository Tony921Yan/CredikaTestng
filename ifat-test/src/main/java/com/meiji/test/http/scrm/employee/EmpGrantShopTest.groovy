package com.meiji.test.http.scrm.employee

import com.meiji.biz.request.http.scrm.employee.EmpGrantShop
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/9/13-14:27
 */
class EmpGrantShopTest extends BaseTest {
    EmpGrantShop empGrantShop = new EmpGrantShop()

    @Test(description = "门店权限设置", groups = ["prod", "uat"], testName = "empgrantshop",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        empGrantShop.invoke(testContext).specialAssert(testContext)
    }
}
