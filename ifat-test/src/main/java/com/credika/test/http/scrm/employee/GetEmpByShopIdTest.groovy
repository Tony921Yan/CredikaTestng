package com.credika.test.http.scrm.employee

import com.credika.biz.request.http.scrm.employee.GetEmpByShopId
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/9/13-11:42
 */
class GetEmpByShopIdTest extends BaseTest {
    GetEmpByShopId emp = new GetEmpByShopId()

    @Test(description = "获取门店下员工列表", groups = ["prod", "uat"], testName = "getEmployeeListByShopId",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        emp.invoke(testContext).baseAssert(testContext)
    }
}
