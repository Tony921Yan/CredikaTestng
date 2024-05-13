package com.credika.biz.request.http.scrm.department

import com.credika.biz.request.http.scrm.ScrmPost

/**
 *
 @author s1mple
 @create 2021/8/23-16:56
 */
class DepartmentDetail extends ScrmPost{
    {
        super.api = "scrm/department/detail"
        super.params = ["id", "level"]
    }
}
