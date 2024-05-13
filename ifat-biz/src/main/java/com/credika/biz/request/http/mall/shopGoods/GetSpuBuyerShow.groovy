package com.credika.biz.request.http.mall.shopGoods

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

/**
 *
 @author Remy
 @create 2021/11/18-10:48
 @version v2.1
 */
class GetSpuBuyerShow extends MallPost{
    {
        super.api = "shopGoods/getSpuBuyerShow"
        super.params=["spuId"]
    }

    GetSpuBuyerShow invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    GetSpuBuyerShow baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
