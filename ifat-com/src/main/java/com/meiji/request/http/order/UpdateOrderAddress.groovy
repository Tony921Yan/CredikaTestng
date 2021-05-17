package com.meiji.request.http.order

import com.meiji.com.TestContext
import com.meiji.request.http.MeijiRequest

class UpdateOrderAddress extends MeijiRequest {
    {
        super.api = "/platform/orderMgr/updateOrderAddress"
        super.params =  [ "id","orderCode","receiverAddress","receiverName","receiverTel"]
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
