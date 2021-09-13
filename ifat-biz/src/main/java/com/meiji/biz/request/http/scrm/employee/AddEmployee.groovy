package com.meiji.biz.request.http.scrm.employee

import com.meiji.biz.request.http.scrm.ScrmPost
import com.miyuan.ifat.support.test.TestContext

/**
 *
 @author s1mple
 @create 2021/9/13-10:56
 */
class AddEmployee extends ScrmPost{
    {
        super.api = "scrm/employee/add"
        super.params = ["employeeId", "employeeIds", "mobile", "newRoleId", "oldRoleId"]
    }

    @Override
    ScrmPost baseAssert(TestContext testContext) {
        //TODO
        assert testContext.getResponse().code == "05000"
    }
}
