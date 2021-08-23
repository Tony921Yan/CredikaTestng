package com.meiji.biz.request.http.scrm.department

import com.meiji.biz.request.http.scrm.ScrmPost

/**
 *
 @author s1mple
 @create 2021/8/23-16:59
 */
class DepartmentList extends ScrmPost{
    {
        super.api = "scrm/department/list"
        super.params = ["id", "level"]
    }
}
