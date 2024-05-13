package com.credika.biz.request.http.platform.shopmanager


import com.miyuan.ifat.support.test.TestContext

class DeleteInviteCode extends com.credika.biz.request.http.platform.PlatformPost {
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
