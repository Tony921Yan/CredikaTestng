package com.meiji.biz.request.http.suppiler

import com.miyuan.ifat.support.test.TestContext
import com.meiji.biz.request.http.MeijiRequest

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
