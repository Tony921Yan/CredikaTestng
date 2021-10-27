package com.meiji.biz.request.http.platform.shopmanager

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class UpdateShopIdentityInfo extends PlatformPost {
    {
        super.api = "/platform/shopMgr/updateShopIdentityInfo"
        super.params =  ["contactEmail","contactIdCardNumber","contactName","idCardCopyUrl","idCardName",
                         "idCardNationalUrl","idCardNumber","idCardValidTimeEnd","idCardValidTimeStart",
        "idCardValidTimeType","merchantShortname","mobilePhone","shopId"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    UpdateShopIdentityInfo invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    UpdateShopIdentityInfo preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    UpdateShopIdentityInfo baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
