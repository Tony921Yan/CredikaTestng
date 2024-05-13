package com.credika.biz.request.http.mall.shopCart

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

/**
 * @author Remy*
 * @date 2022/01/14 18:45
 * @Vession V2.4
 */
class AddCartItem extends MallPost{
    {
        super.api = "ShopCart/addCartItem"
        super.params = ["shopId","userId","skuId","spuId","skuNum","groupFlag","goodsType","ext"]
    }

    AddCartItem invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    AddCartItem baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
