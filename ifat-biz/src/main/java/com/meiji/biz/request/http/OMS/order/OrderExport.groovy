package com.meiji.biz.request.http.OMS.order

import com.meiji.biz.request.http.OMS.OMSPost
import com.miyuan.ifat.support.test.TestContext

class OrderExport extends OMSPost {
    {
        super.api = "/api/supplier/orderMgr/orderExport"
        super.params =  [ "endTime","orderCode","orderStatus","orderType","receiverMsg","shopUserMsg","skuCode","spuCode","startTime","supplierId"]

    }

    OrderExport invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    OrderExport preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    OrderExport baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
