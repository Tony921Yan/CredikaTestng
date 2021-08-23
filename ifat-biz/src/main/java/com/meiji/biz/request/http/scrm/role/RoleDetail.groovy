package com.meiji.biz.request.http.scrm.role

import com.meiji.biz.request.http.scrm.ScrmGet
import com.miyuan.ifat.support.test.TestContext

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
