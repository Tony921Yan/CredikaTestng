package com.meiji.biz.request.http.scrm.permission

import com.meiji.biz.request.http.scrm.ScrmPost

/**
 *
 @author s1mple
 @create 2021/9/17-15:16
 */
class PermissionAdd extends ScrmPost{
    {
        super.api = "scrm/permission/add"
        super.params = ["gmtCreate",
                        "gmtModified",
                        "id",
                        "name",
                        "permission",
                        "state"]
    }
}
