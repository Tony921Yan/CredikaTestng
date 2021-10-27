package com.meiji.biz.request.http.OMS.aftersale

import com.meiji.biz.request.http.OMS.OMSPost
import com.miyuan.ifat.support.test.TestContext

class ExportOrderAfter extends OMSPost {
    {
        super.api = "/api/supplier/orderAfterMgr/exportOrderAfter"
        super.params =  [ "condition","order","page","rows","sort"]

    }

    ExportOrderAfter invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    ExportOrderAfter preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    ExportOrderAfter baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
