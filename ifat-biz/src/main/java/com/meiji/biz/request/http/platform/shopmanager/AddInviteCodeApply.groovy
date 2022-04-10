package com.meiji.biz.request.http.platform.shopmanager

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class AddInviteCodeApply extends PlatformPost {
    {
        super.api = "/invitationList/addInviteCodeApply"
        super.params =  [ "shopId","num"]
    }

    AddInviteCodeApply invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    AddInviteCodeApply preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    AddInviteCodeApply baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
