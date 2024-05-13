package com.credika.biz.request.http.mall.shopCart

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

/**
 * @author Remy*
 * @date 2022/01/14 19:44
 * @Vession V2.4
 */
class UpdateCartItem extends MallPost{
    {
        super.api = "ShopCart/updateCartItem"
        super.params = ["shopId","userId","currentSkuId","preSkuId","skuNum"]
    }

    UpdateCartItem invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    UpdateCartItem baseAssert(TestContext testContext){
        super.baseAssert(testContext)



        return this
    }
}
