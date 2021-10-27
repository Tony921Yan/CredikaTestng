package com.meiji.biz.request.http.OMS.order
import com.meiji.biz.request.http.OMS.OMSGet
import com.miyuan.ifat.support.test.TestContext

class GetOrderLogisticsInfo extends OMSGet {
    {
        super.api = "/api/supplier/orderMgr/getOrderLogisticsInfo"
        super.params =  [ "supplierId","orderCode"]

    }

    GetOrderLogisticsInfo invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetOrderLogisticsInfo preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetOrderLogisticsInfo baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
