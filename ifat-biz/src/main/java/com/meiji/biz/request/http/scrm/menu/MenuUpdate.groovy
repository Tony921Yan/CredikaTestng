package com.meiji.biz.request.http.scrm.menu

import com.meiji.biz.request.http.scrm.ScrmPost
import com.miyuan.ifat.support.test.TestContext

/**
 *
 @author s1mple
 @create 2021/9/18-15:34
 */
class MenuUpdate extends ScrmPost{
    {
        super.api = "scrm/menu/update"
        super.params=["code",
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
