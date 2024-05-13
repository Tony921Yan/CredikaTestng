package com.credika.biz.request.http.OMS.excel

import com.credika.biz.request.http.OMS.OMSPost
import com.miyuan.ifat.support.test.TestContext

class CreateExcelData extends OMSPost {
    {
        super.api = "/api/supplier/excelMgr/createExcelData"
        super.params =  [ "list","supplierId"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    CreateExcelData invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    CreateExcelData preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    CreateExcelData baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
