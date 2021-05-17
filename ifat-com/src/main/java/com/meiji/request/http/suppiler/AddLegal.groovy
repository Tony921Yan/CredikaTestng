package com.meiji.request.http.suppiler

import com.meiji.com.TestContext
import com.meiji.request.http.MeijiRequest

class AddLegal extends MeijiRequest{
    {
        super.api="/platform/supplierMgr/addLegal"
        super.params = ["supplierId","supplierCode","idCardCopy","idCardNational","idCardName","idCardNumber",
        "idCardValidTime","createBy","updateBy","gmtCreate","gmtModified"]
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
