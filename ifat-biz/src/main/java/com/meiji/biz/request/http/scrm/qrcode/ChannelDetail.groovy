package com.meiji.biz.request.http.scrm.qrcode

import com.meiji.biz.request.http.scrm.ScrmPost
import com.miyuan.ifat.support.test.TestContext

/**
 *
 @author s1mple
 @create 2021/8/23-16:42
 */
class ChannelDetail extends ScrmPost{
    {
        super.api = "scrm/qrcode/channel/detail"
        super.params = ["id"]
    }

    @Override
    ScrmPost baseAssert(TestContext testContext) {
        assert testContext.getResponse().code == "05000"
    }
}
