package com.credika.biz.request.http.platform.other


import com.miyuan.ifat.support.test.TestContext

class CreateExcelData extends com.credika.biz.request.http.platform.PlatformPost {
    {
        super.api = "/platform/excelMgr/createExcelData"
        super.params =  [ "list"]
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
