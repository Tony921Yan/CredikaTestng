package com.meiji.request.http.mall

import com.meiji.com.TestContext
import com.meiji.request.http.MeijiRequest

class UpdateApplyAfterSale extends MeijiRequest {
    {
        super.api = "/mall/orderAfterSale/updateApplyAfterSale"
        super.params =  ["afterCode","afterType","id","orderCode","orderGoodsId","refundAmount","refundDesc",
        "refundReason","returnGoodStatus","returnGoodsImgs"]
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
