package com.credika.biz.request.http.scrm.material

import com.credika.biz.request.http.scrm.ScrmPost
import com.miyuan.ifat.support.test.TestContext

/**
 *
 @author s1mple
 @create 2021/9/18-11:05
 */
class MaterialAdd extends ScrmPost{
    {
        super.api = "scrm/material/add"
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
        assert testContext.getResponse().code == "05008"
    }
}
