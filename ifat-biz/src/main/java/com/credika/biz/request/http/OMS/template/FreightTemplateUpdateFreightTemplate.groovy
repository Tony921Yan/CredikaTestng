package com.credika.biz.request.http.OMS.template

import com.credika.biz.request.http.OMS.OMSPost
import com.miyuan.ifat.support.test.TestContext

class FreightTemplateUpdateFreightTemplate extends OMSPost {
    {
        super.api = "/freightTemplate/updateFreightTemplate"
        super.params =  ["status","id","areaCodeList","isParcel","remark","supplierId","templateName","ruleType","freightTemplateRulePrices","freightTemplateRulePricesList","freightTemplateRuleWeight","firstFreight","firstWeight","followFreight","followWeight","isDefault","freightTemplateRuleWeightList","areaCodeList","key","freightDatas","isDefault","firstWeight","firstFreight","followWeight","followFreight"]
    }

    FreightTemplateUpdateFreightTemplate invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    FreightTemplateUpdateFreightTemplate preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    FreightTemplateUpdateFreightTemplate baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
