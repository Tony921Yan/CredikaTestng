package com.meiji.biz.request.http.scrm.qrcode

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
        assert testContext.getResponse().msg == "服务禁用"
    }
}
