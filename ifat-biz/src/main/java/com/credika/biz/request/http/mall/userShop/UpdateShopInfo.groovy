package com.credika.biz.request.http.mall.userShop

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

/**
 *
 @author Remy
 @create 2021/12/23-16:48
 @version v2.3
 */
class UpdateShopInfo extends MallPost{
    {
        super.api = "userShop/updateShopInfo"
        super.params=["id","brief"]
    }

    UpdateShopInfo invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    UpdateShopInfo baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
