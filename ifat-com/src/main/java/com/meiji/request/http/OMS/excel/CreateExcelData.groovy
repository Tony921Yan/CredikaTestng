package com.meiji.request.http.OMS.excel

import com.meiji.com.TestContext
import com.meiji.request.http.MeijiRequest
import com.meiji.service.MysqlService
import com.meiji.util.DateUtil


class CreateExcelData extends MeijiRequest {
    {
        super.api = "/api/supplier/excelMgr/createExcelData"
        super.params =  [ "list","supplierId"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    MeijiRequest invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    MeijiRequest preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    MeijiRequest baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

}
