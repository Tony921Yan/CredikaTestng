package com.meiji.request.http.shop.shopauth

import com.meiji.com.TestContext
import com.meiji.request.http.MeijiRequest

class UpdateShopLicenseInfo extends MeijiRequest {
    {
        super.api = "/shop/updateShopLicenseInfo"
        super.params =  [ "businessLicenseCopy","businessLicenseCopyUrl","businessLicenseType","businessTimeStart",
        "businessTimeType","companyAddress","organizationType","shopId","businessTimeEnd"]
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
