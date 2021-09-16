package com.meiji.biz.request.http.OMS.aftersale

import com.meiji.biz.request.http.OMS.OMSPost
import com.miyuan.ifat.support.test.TestContext

class GetOrderAfterByPage extends OMSPost {
    {
        super.api = "/api/supplier/orderAfterMgr/getOrderAfterByPage"
        super.params =  [ "condition","order","page","rows","sort"]

    }

    OMSPost invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    OMSPost preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    OMSPost baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

}
