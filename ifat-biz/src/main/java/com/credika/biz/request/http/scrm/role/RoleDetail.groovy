package com.credika.biz.request.http.scrm.role

import com.credika.biz.request.http.scrm.ScrmGet

/**
 *
 @author s1mple
 @create 2021/8/20-15:36
 */
class RoleDetail extends ScrmGet{

    {
        super.api = "scrm/role/detail"
        super.params = ["id"]
    }
}
