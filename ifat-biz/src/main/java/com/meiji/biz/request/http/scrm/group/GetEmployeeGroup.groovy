package com.meiji.biz.request.http.scrm.group

import com.meiji.biz.request.http.scrm.ScrmPost

/**
 *
 @author s1mple
 @create 2021/8/23-17:23
 */
class GetEmployeeGroup extends ScrmPost{
    {
        super.api = "scrm/group/getEmployeeGroup"
        super.params = ["corpId", "employeeId", "gmtCreate", "gmtModified", "id", "ownerIds", "state", "version"]
    }
}
