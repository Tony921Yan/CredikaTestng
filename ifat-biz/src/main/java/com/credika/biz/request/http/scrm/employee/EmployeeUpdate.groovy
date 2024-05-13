package com.credika.biz.request.http.scrm.employee

import com.credika.biz.request.http.scrm.ScrmPost

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
