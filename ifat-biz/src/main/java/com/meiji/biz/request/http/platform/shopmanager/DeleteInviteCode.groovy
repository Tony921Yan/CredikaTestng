package com.meiji.biz.request.http.platform.shopmanager

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class DeleteInviteCode extends PlatformPost {
    {
        super.api = "/invitationCodeList/deleteInviteCode"
        super.params =  [ "id"]
    }

    DeleteInviteCode invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    DeleteInviteCode preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    DeleteInviteCode baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
