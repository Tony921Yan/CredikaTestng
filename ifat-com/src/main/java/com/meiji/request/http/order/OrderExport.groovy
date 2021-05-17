package com.meiji.request.http.order

import com.meiji.com.TestContext
import com.meiji.request.http.MeijiRequest

class OrderExport extends MeijiRequest {
    {
        super.api = "/platform/orderMgr/orderExport"
        super.params =  [ "endTime","orderCode","orderStatus","orderType","receiverMsg","shopUserMsg","skuCode","startTime"]
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
