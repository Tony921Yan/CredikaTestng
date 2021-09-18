package com.meiji.biz.request.http.scrm.role

import com.meiji.biz.request.http.scrm.ScrmPost

/**
 *
 @author s1mple
 @create 2021/9/18-16:15
 */
class RoleUpdate extends ScrmPost{
    {
        super.api = "scrm/role/update"
        super.params = ["gmtCreate",
                        "gmtModified",
                        "id",
                        "name",
                        "permission",
                        "state",
                        "type"]
    }
}
