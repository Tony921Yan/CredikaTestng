package com.meiji.biz.request.http.OMS.template

import com.meiji.biz.request.http.OMS.OMSPost
import com.miyuan.ifat.support.test.TestContext

class AddFreightTemplate extends OMSPost {
    {
        super.api = "/api/supplier/freightTemplate/addFreightTemplate"
        super.params =  [ "areaCodeList","isParcel","remark","status","supplierId","templateName"]

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
