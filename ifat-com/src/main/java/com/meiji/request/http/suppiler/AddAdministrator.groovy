package com.meiji.request.http.suppiler

import com.meiji.com.TestContext
import com.meiji.request.http.MeijiRequest

class AddAdministrator extends MeijiRequest{
    {
        super.api="/platform/supplierMgr/addAdministrator"
        super.params = ["supplierId","supplierCode","contactType","contactName","contactIdCardNumber","mobilePhone",
                        "contactEmail","createBy","updateBy","gmtCreate","gmtModified"]
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
