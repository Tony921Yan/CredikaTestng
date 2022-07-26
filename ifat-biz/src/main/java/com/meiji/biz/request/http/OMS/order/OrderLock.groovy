package com.meiji.biz.request.http.OMS.order

import com.meiji.biz.request.http.OMS.OMSPost
import com.miyuan.ifat.support.test.TestContext

class OrderLock extends OMSPost {
    {
        super.api = "OrderDetailManage/orderLock"
        super.params =  [ "orderCodeList"]
    }

    OrderLock invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    OrderLock preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    OrderLock baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
