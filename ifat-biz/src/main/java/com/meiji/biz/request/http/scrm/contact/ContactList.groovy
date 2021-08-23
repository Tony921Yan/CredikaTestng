package com.meiji.biz.request.http.scrm.contact

import com.meiji.biz.request.http.scrm.ScrmPost
import com.miyuan.ifat.support.test.TestContext

/**
 *
 @author s1mple
 @create 2021/8/20-16:02
 */
class ContactList extends ScrmPost{
    {
        super.api = "scrm/contact/list"
        super.params = ["condition", "order", "page", "rows", "sort"]
    }

    @Override
    ScrmPost baseAssert(TestContext testContext) {
        assert testContext.getResponse().code == "05008"
    }
}
