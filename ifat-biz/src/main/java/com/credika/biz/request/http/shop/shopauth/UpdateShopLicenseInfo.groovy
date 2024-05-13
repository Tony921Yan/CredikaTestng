package com.credika.biz.request.http.shop.shopauth
import com.credika.biz.request.http.shop.ShopPost
import com.miyuan.ifat.support.test.TestContext

class UpdateShopLicenseInfo extends ShopPost {
    {
        super.api = "/shop/updateShopLicenseInfo"
        super.params =  [ "businessLicenseCopy","businessLicenseCopyUrl","businessLicenseType","businessTimeStart",
        "businessTimeType","companyAddress","organizationType","shopId","businessTimeEnd"]
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
