package com.credika.biz.request.http.scrm.tag

import com.credika.biz.request.http.scrm.ScrmPost
import com.miyuan.ifat.support.test.TestContext

/**
 *
 @author s1mple
 @create 2021/9/17-16:08
 */
class TagDestroy extends ScrmPost{
    {
        super.api = "scrm/tag/destroy"
        super.params = ["groupId",
                        "groupName",
                        "name",
                        "tagId",
                        "tagIds",
                        "tagNames"]
    }

    @Override
    ScrmPost specialAssert(TestContext testContext) {
        assert testContext.getResponse().code == "05004"
    }
}
