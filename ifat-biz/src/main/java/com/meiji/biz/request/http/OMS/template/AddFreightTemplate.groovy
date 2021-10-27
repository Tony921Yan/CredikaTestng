package com.meiji.biz.request.http.OMS.template

import com.meiji.biz.request.http.OMS.OMSPost
import com.miyuan.ifat.support.test.TestContext

class AddFreightTemplate extends OMSPost {
    {
        super.api = "/api/supplier/freightTemplate/addFreightTemplate"
        super.params =  [ "areaCodeList","isParcel","remark","status","supplierId","templateName"]

    }

    AddFreightTemplate invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    AddFreightTemplate preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    AddFreightTemplate baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
