package com.meiji.biz.request.http.mall.inviteCode

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class FindInviteCodeNum extends MallPost {
    {
        super.api = "inviteCode/findInviteCodeNum"
        super.params =  ["id"]
    }

    FindInviteCodeNum invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    FindInviteCodeNum preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    FindInviteCodeNum baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
