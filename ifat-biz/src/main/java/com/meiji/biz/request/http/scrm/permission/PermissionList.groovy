package com.meiji.biz.request.http.scrm.permission

import com.meiji.biz.request.http.scrm.ScrmGet

/**
 *
 @author s1mple
 @create 2021/9/17-15:39
 */
class PermissionList extends ScrmGet{
    {
        super.api = "scrm/permission/list"
        super.params=["name"]
    }
}
