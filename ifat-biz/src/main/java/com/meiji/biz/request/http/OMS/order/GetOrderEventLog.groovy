package com.meiji.biz.request.http.OMS.order
import com.meiji.biz.request.http.OMS.OMSGet
import com.miyuan.ifat.support.test.TestContext

class GetOrderEventLog extends OMSGet {
    {
        super.api = "/api/supplier/orderMgr/getOrderEventLog"
        super.params =  [ "supplierId","orderCode"]

    }

    GetOrderEventLog invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetOrderEventLog preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetOrderEventLog baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
