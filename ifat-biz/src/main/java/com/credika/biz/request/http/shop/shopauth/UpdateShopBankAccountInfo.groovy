package com.credika.biz.request.http.shop.shopauth
import com.credika.biz.request.http.shop.ShopPost
import com.miyuan.ifat.support.test.TestContext

class UpdateShopBankAccountInfo extends ShopPost {
    {
        super.api = "/shop/updateShopBankAccountInfo"
        super.params =  [ "needAccountInfo","shopId","accountBank","accountName","accountNumber",
        "bankAccountType","bankAddressCode","bankBranchId","bankName"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    ShopPost invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    ShopPost preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    ShopPost baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }
}
