package com.credika.biz.request.http.scrm.department

import com.credika.biz.request.http.scrm.ScrmPost

/**
 *
 @author s1mple
 @create 2021/9/18-11:36
 */
class DepartmentAdd extends ScrmPost{
    {
        super.api = "scrm/department/add"
        super.params=["corpId",
                      "createUserId",
                      "employeeId",
                      "gmtCreate",
                      "gmtModified",
                      "id",
                      "name",
                      "parentId",
                      "state",
                      "updateUserId",
                      "version"]
    }
}
