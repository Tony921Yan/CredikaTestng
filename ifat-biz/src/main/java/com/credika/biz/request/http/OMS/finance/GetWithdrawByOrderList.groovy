package com.credika.biz.request.http.OMS.finance

import com.credika.biz.request.http.OMS.OMSPost
import com.miyuan.ifat.support.test.TestContext

class GetWithdrawByOrderList extends OMSPost {
    {
        super.api = "AccountAssets/getWithdrawByOrderList"
        super.params =  ["goodsList", "logisticsCode","logisticsCompanyName","orderCode","supplierId"]

    }

    GetWithdrawByOrderList invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetWithdrawByOrderList preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetWithdrawByOrderList baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
