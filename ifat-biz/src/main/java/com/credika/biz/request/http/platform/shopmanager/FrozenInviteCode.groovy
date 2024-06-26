package com.credika.biz.request.http.platform.shopmanager


import com.miyuan.ifat.support.test.TestContext

class FrozenInviteCode extends com.credika.biz.request.http.platform.PlatformPost {
    {
        super.api = "/invitationCodeList/frozenInviteCode"
        super.params =  [ "id"]
    }

    FrozenInviteCode invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    FrozenInviteCode preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    FrozenInviteCode baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
