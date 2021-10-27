package com.meiji.biz.request.http.platform.shopmanager

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class UpdateBankCardInfo extends PlatformPost {
    {
        super.api = "/platform/shopMgr/updateBankCardInfo"
        super.params =  [ "accountBank","accountNumber","accountType","bankAddressCode","bankBranchId","bankName","shopId"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    UpdateBankCardInfo invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    UpdateBankCardInfo preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    UpdateBankCardInfo baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
