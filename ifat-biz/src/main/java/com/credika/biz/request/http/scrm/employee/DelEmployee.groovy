package com.credika.biz.request.http.scrm.employee

import com.credika.biz.request.http.scrm.ScrmPost
import com.miyuan.ifat.support.test.TestContext

/**
 *
 @author s1mple
 @create 2021/9/13-11:32
 */
class DelEmployee extends ScrmPost{
    {
        super.api = "scrm/employee/destroy"
        super.params = ["employeeId", "employeeIds", "ids", "mobile", "name", "perEndTime", "perStartTime", "roleId"]
    }

    @Override
    ScrmPost baseAssert(TestContext testContext) {
        //TODO
        assert testContext.getResponse().code == "05004"
    }
}
