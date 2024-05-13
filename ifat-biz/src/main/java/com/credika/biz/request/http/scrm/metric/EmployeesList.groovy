package com.credika.biz.request.http.scrm.metric

import com.credika.biz.request.http.scrm.ScrmPost

/**
 *
 @author s1mple
 @create 2021/9/18-14:51
 */
class EmployeesList extends ScrmPost {
    {
        super.api = "scrm/group/metric/employeesList"
        super.params = [
                "condition",
                "order",
                "page",
                "rows",
                "sort"]
    }
}
