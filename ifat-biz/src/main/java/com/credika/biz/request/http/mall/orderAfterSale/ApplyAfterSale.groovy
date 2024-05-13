package com.credika.biz.request.http.mall.orderAfterSale

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class ApplyAfterSale extends MallPost {
    {
        super.api = "/orderAfterSale/applyAfterSale"
        super.params =  ["afterType","orderCode","orderGoodsId","refundAmount","refundDesc","refundReason",
                         "returnGoodStatus","returnGoodsImgs"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    ApplyAfterSale invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    ApplyAfterSale preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    ApplyAfterSale baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
