package com.meiji.biz.request.http.OMS.aftersale

import com.meiji.biz.request.http.OMS.OMSPost
import com.miyuan.ifat.support.test.TestContext

class SyncAfterReport extends OMSPost {
    {
        super.api = "/api/supplier/orderAfterMgr/syncAfterReport"
        super.params =  [ ""]

    }

    SyncAfterReport invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    SyncAfterReport preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    SyncAfterReport baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
