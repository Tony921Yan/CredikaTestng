package com.meiji.biz.request.http.scrm.material

import com.meiji.biz.request.http.scrm.ScrmPost
import com.miyuan.ifat.support.test.TestContext

/**
 *
 @author s1mple
 @create 2021/9/18-11:30
 */
class MaterialUpdate extends ScrmPost{
    {
        super.api = "scrm/material/update"
        super.params=["groupId",
                      "id",
                      "imageLink",
                      "name",
                      "text",
                      "type",
                      "videoCoverLink",
                      "videoLink",
                      "webPageLinks",
                      "webPageTitle",
                      "webPageType"]
    }

    @Override
    ScrmPost baseAssert(TestContext testContext) {
        assert testContext.getResponse().code == "05000"
    }
}
