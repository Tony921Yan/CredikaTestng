package com.credika.biz.request.http.OMS.order
import com.credika.biz.request.http.OMS.OMSPost
import com.miyuan.ifat.support.test.TestContext

class GetOrderDetail extends OMSPost{
    {
        super.api = "OrderDetailManage/getOrderDetail"
        super.params =  ["supplierId","id"]
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
