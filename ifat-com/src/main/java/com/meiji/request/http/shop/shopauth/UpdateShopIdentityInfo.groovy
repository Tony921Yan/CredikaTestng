package com.meiji.request.http.shop.shopauth

import com.meiji.com.TestContext
import com.meiji.request.http.MeijiRequest

class UpdateShopIdentityInfo extends MeijiRequest {
    {
        super.api = "/shop/updateShopIdentityInfo"
        super.params =  [ "idCardCopy","idCardCopyUrl","idCardName","idCardNational","idCardNationalUrl",
        "idCardNumber","idCardValidTimeStart","idCardValidTimeType","mobilePhone","shopId","contactEmail",
        "contactIdCardNumber","contactName","idCardValidTimeEnd"]
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
