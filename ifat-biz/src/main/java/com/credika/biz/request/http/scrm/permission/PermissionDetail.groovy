package com.credika.biz.request.http.scrm.permission

import com.credika.biz.request.http.scrm.ScrmGet
import com.miyuan.ifat.support.test.TestContext

/**
 *
 @author s1mple
 @create 2021/9/17-15:22
 */
class PermissionDetail extends ScrmGet{
    {
        super.api = "scrm/permission/detail"
        super.params=["id"]
    }

    @Override
    ScrmGet specialAssert(TestContext testContext) {
        assert testContext.getResponse().code == "05000"
    }
}
