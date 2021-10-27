package com.meiji.biz.request.http.OMS.aftersale

import com.meiji.biz.request.http.OMS.OMSPost
import com.miyuan.ifat.support.test.TestContext

class CheckGoods extends OMSPost {
    {
        super.api = "/api/supplier/orderAfterMgr/checkGoods"
        super.params =  [ "supplierId","orderAfterCode","logisticsCode","logisticsCompanyName"]

    }

    CheckGoods invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    CheckGoods preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    CheckGoods baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
