package com.credika.biz.request.http.OMS.excel

import com.credika.biz.request.http.OMS.OMSPost
import com.miyuan.ifat.support.test.TestContext

class CreateTask extends OMSPost {
    {
        super.api = "/api/supplier/excelMgr/createTask"
        super.params =  ["excelRows","fileName","fileUrl","id","supplierId","taskType","uploadUser","uploadUserId"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    CreateTask invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    CreateTask preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    CreateTask baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
