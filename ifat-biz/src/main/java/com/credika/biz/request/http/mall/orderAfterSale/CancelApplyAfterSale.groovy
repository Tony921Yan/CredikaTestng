package com.credika.biz.request.http.mall.orderAfterSale

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class CancelApplyAfterSale extends MallPost {
    {
        super.api = "/orderAfterSale/cancelApplyAfterSale"
        super.params =  ["afterCode","id","orderCode","orderGoodsId"]
//      super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    CancelApplyAfterSale invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    CancelApplyAfterSale preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    CancelApplyAfterSale baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
