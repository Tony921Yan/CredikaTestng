package com.credika.biz.request.http.OMS.aftersale

import com.credika.biz.request.http.OMS.OMSPost
import com.miyuan.ifat.support.test.TestContext

class ExportOrderAfter extends OMSPost {
    {
        super.api = "AftersalesDetailManage/exportOrderAfter"
        super.params =  ["condition"]

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
        assert testContext.get("result").getAt("httpStatusCode") ==200
        return this
    }

}
