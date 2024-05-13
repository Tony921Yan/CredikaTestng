package com.credika.biz.request.http.scrm.role

import com.credika.biz.request.http.scrm.ScrmPost
import com.miyuan.ifat.support.test.TestContext

/**
 *
 @author s1mple
 @create 2021/9/18-15:58
 */
class GrantRoleMenu extends ScrmPost{
    {
        super.api = "scrm/role/grant_role_menu"
        super.params = ["gmtCreate",
                        "gmtModified",
                        "id",
                        "menuIdList",
                        "roleId",
                        "state"]
    }

    @Override
    ScrmPost baseAssert(TestContext testContext) {
        assert testContext.getResponse().code == "05000"
    }
}
