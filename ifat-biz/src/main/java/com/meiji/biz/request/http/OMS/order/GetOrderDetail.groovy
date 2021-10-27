package com.meiji.biz.request.http.OMS.order
import com.meiji.biz.request.http.OMS.OMSGet
import com.miyuan.ifat.support.test.TestContext

class GetOrderDetail extends OMSGet {
    {
        super.api = "/api/supplier/orderMgr/getOrderDetail"
        super.params =  [ "supplierId","id"]

    }

    GetOrderDetail invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetOrderDetail preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetOrderDetail baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
