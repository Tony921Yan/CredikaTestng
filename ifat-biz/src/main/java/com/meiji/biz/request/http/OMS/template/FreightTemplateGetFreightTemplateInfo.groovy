package com.meiji.biz.request.http.OMS.template

import com.meiji.biz.request.http.OMS.OMSPost
import com.miyuan.ifat.support.test.TestContext

class FreightTemplateGetFreightTemplateInfo extends OMSPost {
    {
        super.api = "/freightTemplate/getFreightTemplateInfo"
        super.params =  [ "supplierId","id"]
    }

    FreightTemplateGetFreightTemplateInfo invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    FreightTemplateGetFreightTemplateInfo preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    FreightTemplateGetFreightTemplateInfo baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
