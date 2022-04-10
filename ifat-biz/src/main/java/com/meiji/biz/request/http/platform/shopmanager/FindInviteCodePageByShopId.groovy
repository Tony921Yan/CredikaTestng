package com.meiji.biz.request.http.platform.shopmanager

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class FindInviteCodePageByShopId extends PlatformPost {
    {
        super.api = "invitationCodeList/findInviteCodePageByShopId"
        super.params =  [ "page","rows","shopId"]
    }

    FindInviteCodePageByShopId invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    FindInviteCodePageByShopId preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    FindInviteCodePageByShopId baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
