package com.credika.biz.request.http.OMS.order

import com.credika.biz.request.http.OMS.OMSPost
import com.miyuan.ifat.support.test.TestContext

class GetOrderCount extends OMSPost {
    {
        super.api = "OrderDetailManage/getOrderCount"
        super.params =  [ "supplierId","startTime","endTime"]
    }

    GetOrderCount invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetOrderCount preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetOrderCount baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
