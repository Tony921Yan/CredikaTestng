package com.meiji.biz.request.http.platform.other

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class FindInviteCodePage extends PlatformPost {
    {
        super.api = "/platform/inviteCodeMgr/findInviteCodePage"
        super.params =  [ "applyId","code","page","rows","useTimeEnd","useTimeStart"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    FindInviteCodePage invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    FindInviteCodePage preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    FindInviteCodePage baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
