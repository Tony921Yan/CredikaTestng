package com.meiji.biz.request.http.OMS.aftersale

import com.meiji.biz.request.http.OMS.OMSGet
import com.miyuan.ifat.support.test.TestContext

class ExportOrderAfter extends OMSGet {
    {
        super.api = "/api/supplier/orderAfterMgr/exportOrderAfter"
        super.params =  [ "condition","order","page","rows","sort"]

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
