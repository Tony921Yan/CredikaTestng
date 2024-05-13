package com.credika.biz.request.http.OMS.account

import com.credika.biz.request.http.OMS.OMSGet
import com.miyuan.ifat.support.test.TestContext

class GetBindCardInfo extends OMSGet {
    {
        super.api = "/api/supplier/finance/getBindCardInfo"
        super.params =  [ "supplierId"]

    }

    GetBindCardInfo invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetBindCardInfo preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetBindCardInfo baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
