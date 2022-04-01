package com.meiji.biz.request.http.platform.suppiler
import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class AddLegal extends PlatformPost{
    {
        super.api="/SupplierManage/addLegal"
        super.params = ["supplierId","supplierCode","idCardCopy","idCardNational","idCardName","idCardNumber",
        "idCardValidTime"]
    }

    AddLegal invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    AddLegal preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    AddLegal baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
