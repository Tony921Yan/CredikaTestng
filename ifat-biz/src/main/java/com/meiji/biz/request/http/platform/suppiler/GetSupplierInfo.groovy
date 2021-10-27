package com.meiji.biz.request.http.platform.suppiler

import com.meiji.biz.request.http.platform.PlatformGet
import com.miyuan.ifat.support.test.TestContext

class GetSupplierInfo extends PlatformGet{
    {
        super.api="/platform/supplierMgr/getSupplierInfo"
        super.params = ["code"]
    }

    GetSupplierInfo invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetSupplierInfo preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetSupplierInfo baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
