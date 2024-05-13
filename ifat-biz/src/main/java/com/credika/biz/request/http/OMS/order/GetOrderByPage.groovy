package com.credika.biz.request.http.OMS.order

import com.credika.biz.request.http.OMS.OMSPost
import com.miyuan.ifat.support.test.TestContext

class GetOrderByPage extends OMSPost {
    {
        super.api = "OrderDetailManage/getOrderByPage"
        super.params =  [ "condition","order","page","rows","sort"]

    }

    GetOrderByPage invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetOrderByPage preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetOrderByPage baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
