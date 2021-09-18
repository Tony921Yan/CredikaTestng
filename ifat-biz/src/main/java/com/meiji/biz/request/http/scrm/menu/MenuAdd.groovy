package com.meiji.biz.request.http.scrm.menu

import com.meiji.biz.request.http.scrm.ScrmPost
import com.miyuan.ifat.support.test.TestContext

/**
 *
 @author s1mple
 @create 2021/9/18-15:19
 */
class MenuAdd extends ScrmPost {
    {
        super.api = "scrm/menu/add"
        super.params = ["code",
                        "gmtCreate",
                        "gmtModified",
                        "icon",
                        "id",
                        "name",
                        "pid",
                        "state",
                        "type",
                        "url"]
    }

    @Override
    ScrmPost baseAssert(TestContext testContext) {
        assert testContext.getResponse().code == "05008"
    }
}
