package com.meiji.biz.request.http.OMS.account

import com.meiji.biz.request.http.OMS.OMSPost
import com.miyuan.ifat.support.test.TestContext

class GetRegionCode extends OMSPost {
    {
        super.api = "/api/supplier/finance/getRegionCode"
        super.params =  [ "city","cityCode","proviceCode","province","region"]

    }

    GetRegionCode invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetRegionCode preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetRegionCode baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
