package com.meiji.biz.request.http.platform.other

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class UnfreezeInviteCode extends PlatformPost {
    {
        super.api = "/invitationCodeList/unfreezeInviteCode"
        super.params =  [ "id"]
    }

    UnfreezeInviteCode invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    UnfreezeInviteCode preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    UnfreezeInviteCode baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
