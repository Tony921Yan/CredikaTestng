package com.meiji.request.http.shop.shopauth

import com.meiji.com.TestContext
import com.meiji.request.http.MeijiRequest

class UpdateShopCompanyInfo extends MeijiRequest {
    {
        super.api = "/shop/updateShopCompanyInfo"
        super.params =  [ "businessLicenseNumber","codeType","legalPerson","legalPersonWechat","merchantName",
        "shopId"]
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
