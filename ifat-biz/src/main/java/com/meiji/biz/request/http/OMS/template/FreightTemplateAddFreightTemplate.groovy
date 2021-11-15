package com.meiji.biz.request.http.OMS.template

import com.meiji.biz.request.http.OMS.OMSPost
import com.miyuan.ifat.support.test.TestContext

class FreightTemplateAddFreightTemplate extends OMSPost {
    {
        super.api = "/freightTemplate/addFreightTemplate"
        super.params =  [ "status","areaCodeList","isParcel","remark","supplierId","templateName","ruleType","freightTemplateRulePrices","isFixed","orderPrice","freight","freightTemplateRulePricesList","areaCodeList","key","freightDatas","isFixed","fixedFreight","freightTemplateRuleWeight","freightTemplateRuleWeightList"]

    }

    FreightTemplateAddFreightTemplate invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    FreightTemplateAddFreightTemplate preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    FreightTemplateAddFreightTemplate baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
