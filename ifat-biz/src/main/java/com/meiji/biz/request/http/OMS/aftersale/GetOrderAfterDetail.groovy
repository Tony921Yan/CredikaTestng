package com.meiji.biz.request.http.OMS.aftersale

import com.meiji.biz.request.http.OMS.OMSGet
import com.miyuan.ifat.support.test.TestContext

class GetOrderAfterDetail extends OMSGet {
    {
        super.api = "/api/supplier/orderAfterMgr/getOrderAfterDetail"
        super.params =  [ "supplierId","orderAfterCode"]

    }

    GetOrderAfterDetail invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetOrderAfterDetail preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetOrderAfterDetail baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
