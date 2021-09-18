package com.meiji.biz.request.http.scrm.qrcode

import com.meiji.biz.request.http.scrm.ScrmPost
import com.miyuan.ifat.support.test.TestContext

/**
 *
 @author s1mple
 @create 2021/9/18-14:32
 */
class QrPullGroup extends ScrmPost {
    {
        super.api = "scrm/qrcode/group/pullGroup"
        super.params = ["gmtCreate",
                        "gmtModified",
                        "groupChatInfo",
                        "id",
                        "isShow",
                        "leadWords",
                        "name",
                        "picUrl",
                        "pullType",
                        "remark",
                        "shopId",
                        "state",
                        "tagIds",
                        "useManIds"]
    }

    @Override
    ScrmPost baseAssert(TestContext testContext) {
        assert testContext.getResponse().code == "05007"  //TODO
    }
}
