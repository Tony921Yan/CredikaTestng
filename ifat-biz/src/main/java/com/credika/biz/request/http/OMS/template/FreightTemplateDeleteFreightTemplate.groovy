package com.credika.biz.request.http.OMS.template

import com.credika.biz.request.http.OMS.OMSPost
import com.miyuan.ifat.support.test.TestContext

class FreightTemplateDeleteFreightTemplate extends OMSPost {
    {
        super.api = "/freightTemplate/deleteFreightTemplate"
        super.params =  [ "supplierId","id"]
    }

    FreightTemplateDeleteFreightTemplate invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    FreightTemplateDeleteFreightTemplate preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    FreightTemplateDeleteFreightTemplate baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
