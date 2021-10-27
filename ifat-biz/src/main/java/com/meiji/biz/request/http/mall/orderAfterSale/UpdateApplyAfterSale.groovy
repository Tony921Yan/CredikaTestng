package com.meiji.biz.request.http.mall.orderAfterSale

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class UpdateApplyAfterSale extends MallPost {
    {
        super.api = "/orderAfterSale/updateApplyAfterSale"
        super.params =  ["afterCode","afterType","id","orderCode","orderGoodsId","refundAmount","refundDesc",
        "refundReason","returnGoodStatus","returnGoodsImgs"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    UpdateApplyAfterSale invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    UpdateApplyAfterSale preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    UpdateApplyAfterSale baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
