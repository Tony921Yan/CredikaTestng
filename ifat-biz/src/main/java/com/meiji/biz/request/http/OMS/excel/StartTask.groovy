package com.meiji.biz.request.http.OMS.excel


import com.miyuan.ifat.support.test.TestContext

class StartTask extends OMSPost {
    {
        super.api = "/api/supplier/excelMgr/startTask"
        super.params =  [ "taskId","supplierId"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    OMSPost invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    OMSPost preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    OMSPost baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

}
