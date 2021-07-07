package com.meiji.biz.request.http.OMS.account

import com.meiji.biz.request.http.OMS.OMSGet
import com.miyuan.ifat.support.test.TestContext

class GetBindCardInfo extends OMSGet {
    {
        super.api = "/api/supplier/finance/getBindCardInfo"
        super.params =  [ "supplierId"]

    }

    OMSGet invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    OMSGet preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    OMSGet baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

}