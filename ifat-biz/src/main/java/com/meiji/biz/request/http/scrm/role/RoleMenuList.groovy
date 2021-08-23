package com.meiji.biz.request.http.scrm.role

import com.meiji.biz.request.http.scrm.ScrmPost
import com.miyuan.ifat.support.test.TestContext

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
