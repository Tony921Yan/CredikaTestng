package com.meiji.biz.request.http.platform.shopmanager

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class FindInviteCodePage extends PlatformPost {
    {
        super.api = "invitationCodeList/queryPage"
        super.params =  ["pageNum","pageSize","code","validDate","usedShopDealerPhone","shopDealerPhone"]
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
