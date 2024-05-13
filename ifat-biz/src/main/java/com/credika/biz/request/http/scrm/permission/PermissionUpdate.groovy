package com.credika.biz.request.http.scrm.permission

import com.credika.biz.request.http.scrm.ScrmPost

/**
 *
 @author s1mple
 @create 2021/9/17-15:45
 */
class PermissionUpdate extends ScrmPost{
    {
        super.api = "scrm/permission/update"
        super.params = ["gmtCreate",
                        "gmtModified",
                        "id",
                        "name",
                        "permission",
                        "state"]
    }
}
