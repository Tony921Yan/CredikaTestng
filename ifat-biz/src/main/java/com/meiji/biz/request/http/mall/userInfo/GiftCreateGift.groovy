package com.meiji.biz.request.http.mall.userInfo

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class GiftCreateGift extends MallPost {
    {
        super.api = "/gift/createGift"
        super.params =  ["giftType","actuallyPaidAmount","goodsTotalAmount","payableAmount","giftGoods","activeId","seckillPrice","skuId","skuNum","skuPrice","supplierId","rank","sort","receiverNumber","shopId","openId","isSowPrizeLevel"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    GiftCreateGift invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GiftCreateGift baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
