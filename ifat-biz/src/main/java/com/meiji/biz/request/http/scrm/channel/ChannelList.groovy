package com.meiji.biz.request.http.scrm.channel

import com.meiji.biz.request.http.scrm.ScrmPost
import com.miyuan.ifat.support.test.TestContext

/**
 *
 @author s1mple
 @create 2021/8/23-16:33
 */
class ChannelList extends ScrmPost{
    {
        super.api = "scrm/qrcode/channel/list"
        super.params = ["condition", "order", "page", "rows", "sort"]
    }

    @Override
    ScrmPost baseAssert(TestContext testContext) {
        assert testContext.getResponse().code == "05016"
    }
}
