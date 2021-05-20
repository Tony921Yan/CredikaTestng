package com.meiji.biz.request.http.shop.shopauth
import com.meiji.biz.request.http.shop.ShopPost
import com.miyuan.ifat.support.test.TestContext

class UpdateShopIdentityInfo extends ShopPost {
    {
        super.api = "/shop/updateShopIdentityInfo"
        super.params =  [ "idCardCopy","idCardCopyUrl","idCardName","idCardNational","idCardNationalUrl",
        "idCardNumber","idCardValidTimeStart","idCardValidTimeType","mobilePhone","shopId","contactEmail",
        "contactIdCardNumber","contactName","idCardValidTimeEnd"]
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
