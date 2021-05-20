package com.meiji.biz.request.http.OMS.excel


import com.miyuan.ifat.support.test.TestContext

class CreateTask extends OMSPost {
    {
        super.api = "/api/supplier/excelMgr/createTask"
        super.params =  ["excelRows","fileName","fileUrl","id","supplierId","taskType","uploadUser","uploadUserId"]
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
