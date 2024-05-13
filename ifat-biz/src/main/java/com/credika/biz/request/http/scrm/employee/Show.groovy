package com.credika.biz.request.http.scrm.employee

import com.credika.biz.request.http.scrm.ScrmGet

/**
 *
 @author s1mple
 @create 2021/8/23-15:58
 */
class Show extends ScrmGet{
    {
        super.api = "scrm/employee/show"
        super.params = ["employeeId", "roleId"]
    }
}
