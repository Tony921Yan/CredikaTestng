package com.credika.biz.request.http.scrm.employee

import com.credika.biz.request.http.scrm.ScrmPost

/**
 *
 @author s1mple
 @create 2021/8/23-15:12
 */
class EmployeeList extends ScrmPost{
    {
        super.api = "scrm/employee/list"
        super.params = ["condition", "page", "rows"]
    }
}
