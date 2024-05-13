package com.credika.biz.request.http.mall.orderInfo

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

/**
 * @author Remy*
 * @date 2022/02/07 10:28
 * @Vession V2.5
 */
class GetOrderGoodsInfo extends MallPost{
    {
        super.api = "orderInfo/getOrderGoodsInfo"
        super.params = ["orderGoodsId"]
    }

    GetOrderGoodsInfo invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    GetOrderGoodsInfo baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
