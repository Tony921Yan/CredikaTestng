package com.meiji.biz.request.http.scrm.employee

import com.meiji.biz.request.http.scrm.ScrmPost
import com.miyuan.ifat.support.test.TestContext

/**
 *
 @author s1mple
 @create 2021/9/17-10:18
 */
class EmployeeUpdate extends ScrmPost{
    {
        super.api = "scrm/employee/update"
        super.params = ["employeeId",
                        "employeeIds",
                        "mobile",
                        "newRoleId",
                        "oldRoleId"]
    }
}
