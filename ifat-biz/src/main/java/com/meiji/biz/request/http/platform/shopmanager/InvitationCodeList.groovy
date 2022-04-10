package com.meiji.biz.request.http.platform.shopmanager

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class InvitationCodeList extends PlatformPost {
    {
        super.api = "invitationCodeList/queryPage"
        super.params =  [ "pageNum","pageSize","code","validDate","usedShopDealerPhone","shopDealerPhone"]
    }

    InvitationCodeList invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    InvitationCodeList preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    InvitationCodeList baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    InvitationCodeList specialAssert(TestContext testContext){
        Map apiResult = testContext.getResponse().data
        assert apiResult.total > 20
        return this
    }
}
