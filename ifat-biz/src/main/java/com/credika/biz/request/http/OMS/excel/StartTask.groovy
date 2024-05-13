package com.credika.biz.request.http.OMS.excel

import com.credika.biz.request.http.OMS.OMSPost
import com.miyuan.ifat.support.test.TestContext

class StartTask extends OMSPost {
    {
        super.api = "/api/supplier/excelMgr/startTask"
        super.params =  [ "taskId","supplierId"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    StartTask invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    StartTask preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    StartTask baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
