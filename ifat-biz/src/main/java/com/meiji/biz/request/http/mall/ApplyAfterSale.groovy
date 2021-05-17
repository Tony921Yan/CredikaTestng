package com.meiji.biz.request.http.mall

import com.miyuan.ifat.support.test.TestContext
import com.meiji.biz.request.http.MeijiRequest

class ApplyAfterSale extends MeijiRequest {
    {
        super.api = "/mall/orderAfterSale/applyAfterSale"
        super.params =  ["afterType","orderCode","orderGoodsId","refundAmount","refundDesc","refundReason",
                         "returnGoodStatus","returnGoodsImgs"]
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
