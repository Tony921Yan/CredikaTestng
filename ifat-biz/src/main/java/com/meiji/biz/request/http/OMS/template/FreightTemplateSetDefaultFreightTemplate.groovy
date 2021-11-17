package com.meiji.biz.request.http.OMS.template

import com.meiji.biz.request.http.OMS.OMSPost
import com.miyuan.ifat.support.test.TestContext

class FreightTemplateSetDefaultFreightTemplate extends OMSPost {
    {
        super.api = "/freightTemplate/setDefaultFreightTemplate"
        super.params =  [ "supplierId","id"]
    }

    FreightTemplateSetDefaultFreightTemplate invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    FreightTemplateSetDefaultFreightTemplate preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    FreightTemplateSetDefaultFreightTemplate baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
