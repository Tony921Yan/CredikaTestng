package com.credika.biz.request.http.scrm.role

import com.credika.biz.request.http.scrm.ScrmPost

/**
 *
 @author s1mple
 @create 2021/9/18-16:18
 */
class UpdateGrantRoleMenu extends ScrmPost {
    {
        super.api = "scrm/role/update_grant_role_menu"
        super.params = ["gmtCreate",
                        "gmtModified",
                        "id",
                        "menuIdList",
                        "roleId",
                        "state"]
    }
}
