package com.credika.biz.request.http.scrm.role

import com.credika.biz.request.http.scrm.ScrmPost

/**
 *
 @author s1mple
 @create 2021/8/20-15:44
 */
class RoleMenuList extends ScrmPost{
    {
        super.api = "/scrm/role/role_menu_list"
        super.params = ["roleId"]
    }
}
