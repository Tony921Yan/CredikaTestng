package com.meiji.biz.request.http.mall.inviteCode

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class FinShopInviteCodeCostInfo extends MallPost {
    {
        super.api = "inviteCode/finShopInviteCodeCostInfo"
        super.params =  ["id"]
    }

    FinShopInviteCodeCostInfo invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    FinShopInviteCodeCostInfo preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    FinShopInviteCodeCostInfo baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
