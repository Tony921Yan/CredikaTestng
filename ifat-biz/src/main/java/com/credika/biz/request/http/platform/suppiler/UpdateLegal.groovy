package com.credika.biz.request.http.platform.suppiler


import com.miyuan.ifat.support.test.TestContext

class UpdateLegal extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api="/SupplierManage/updateLegal"
        super.params = ["id","idCardCopy","idCardNational","idCardName","idCardNumber",
        "idCardValidTime"]
    }

    UpdateLegal invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    UpdateLegal preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    UpdateLegal baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
