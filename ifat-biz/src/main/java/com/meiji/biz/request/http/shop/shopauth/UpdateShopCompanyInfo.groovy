package com.meiji.biz.request.http.shop.shopauth

import com.miyuan.ifat.support.test.TestContext
import com.meiji.biz.request.http.MeijiRequest

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
