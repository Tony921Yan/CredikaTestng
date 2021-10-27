package com.meiji.biz.request.http.platform.shopmanager

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class UpdateShopCompanyInfo extends PlatformPost {
    {
        super.api = "/platform/shopMgr/updateShopCompanyInfo"
        super.params =  ["businessLicenseNumber","codeType","legalPerson","legalPersonWechat","merchantName","shopId"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    UpdateShopCompanyInfo invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    UpdateShopCompanyInfo preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    UpdateShopCompanyInfo baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
