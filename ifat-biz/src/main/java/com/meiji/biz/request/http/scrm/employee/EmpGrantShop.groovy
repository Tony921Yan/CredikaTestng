package com.meiji.biz.request.http.scrm.employee

import com.meiji.biz.request.http.scrm.ScrmPost
import com.miyuan.ifat.support.test.TestContext

/**
 *
 @author s1mple
 @create 2021/9/13-14:25
 */
class EmpGrantShop extends ScrmPost{
    {
        super.api = "scrm/employee/grant_shop"
        super.params = ["employeeId", "gmtCreate", "gmtModified", "grants", "id", "state"]
    }

    @Override
    ScrmPost specialAssert(TestContext testContext) {
        assert testContext.getResponse().code == "05008"
    }
}
