package com.meiji.biz.request.http.platform.other

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class FindInviteCodeApplyPage extends PlatformPost {
    {
        super.api = "/platform/inviteCodeMgr/findInviteCodeApplyPage"
        super.params =  [ "keyword","page","rows","validTimeEnd","validTimeStart"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    FindInviteCodeApplyPage invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    FindInviteCodeApplyPage preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    FindInviteCodeApplyPage baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
