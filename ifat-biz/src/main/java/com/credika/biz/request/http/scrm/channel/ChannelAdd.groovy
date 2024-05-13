package com.credika.biz.request.http.scrm.channel

import com.credika.biz.request.http.scrm.ScrmPost
import com.miyuan.ifat.support.test.TestContext

/**
 *
 @author s1mple
 @create 2021/9/17-16:32
 */
class ChannelAdd extends ScrmPost{
    {
        super.api = "scrm/qrcode/channel/add"
        super.params = ["departId",
                        "gmtCreate",
                        "gmtModified",
                        "headUrl",
                        "id",
                        "materialIds",
                        "name",
                        "remark",
                        "shopId",
                        "skipVerify",
                        "state",
                        "tagIds",
                        "type",
                        "useManInfos",
                        "welcomeText"]
    }

    @Override
    ScrmPost baseAssert(TestContext testContext) {
        assert testContext.getResponse().code == "05008"
    }
}
