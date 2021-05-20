package com.meiji.biz.request.http.shop.shopauth
import com.meiji.biz.request.http.shop.ShopPost
import com.miyuan.ifat.support.test.TestContext

class UpdateShopInfo extends ShopPost {
    {
        super.api = "/shop/updateShopInfo"
        super.params =  [ "id","brief","shopIcon","shopName","shopShortName"]
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
