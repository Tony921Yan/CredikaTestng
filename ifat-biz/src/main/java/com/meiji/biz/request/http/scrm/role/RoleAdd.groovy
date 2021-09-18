package com.meiji.biz.request.http.scrm.role

import com.meiji.biz.request.http.scrm.ScrmPost
import com.miyuan.ifat.support.test.TestContext

/**
 *
 @author s1mple
 @create 2021/9/18-15:43
 */
class RoleAdd extends ScrmPost{
    {
        super.api = "scrm/role/add"
        super.params = ["gmtCreate",
                        "gmtModified",
                        "id",
                        "name",
                        "permission",
                        "state",
                        "type"]
    }

    @Override
    ScrmPost baseAssert(TestContext testContext) {
        assert testContext.getResponse().code == "05008"
    }
}
