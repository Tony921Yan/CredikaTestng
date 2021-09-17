package com.meiji.biz.request.http.scrm.tag

import com.meiji.biz.request.http.scrm.ScrmPost
import com.miyuan.ifat.support.test.TestContext

/**
 *
 @author s1mple
 @create 2021/9/17-16:14
 */
class TagUpdate extends ScrmPost {
    {
        super.api = "scrm/tag/update"
        super.params = ["groupId",
                        "groupName",
                        "name",
                        "tagId",
                        "tagIds",
                        "tagNames"]
    }

    @Override
    ScrmPost baseAssert(TestContext testContext) {
        assert testContext.getResponse().code == "05004"
    }
}
