package com.meiji.biz.request.http.platform.suppiler

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class AddLegal extends PlatformPost{
    {
        super.api="/platform/supplierMgr/addLegal"
        super.params = ["supplierId","supplierCode","idCardCopy","idCardNational","idCardName","idCardNumber",
        "idCardValidTime","createBy","updateBy","gmtCreate","gmtModified"]
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
