package com.meiji.request.http.shop.shopauth

import com.meiji.com.TestContext
import com.meiji.request.http.MeijiRequest

class UpdateShopBankAccountInfo extends MeijiRequest {
    {
        super.api = "/shop/updateShopBankAccountInfo"
        super.params =  [ "needAccountInfo","shopId","accountBank","accountName","accountNumber",
        "bankAccountType","bankAddressCode","bankBranchId","bankName"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    MeijiRequest invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    MeijiRequest preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    MeijiRequest baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }
}
