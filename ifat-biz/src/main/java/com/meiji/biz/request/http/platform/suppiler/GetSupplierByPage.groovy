package com.meiji.biz.request.http.platform.suppiler

import com.meiji.biz.request.http.platform.PlatformGet
import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class GetSupplierByPage extends PlatformPost{
    {
        super.api="SupplierManage/getSupplierByPage"
        super.params = ["condition","order","page","rows","sort"]
    }

    GetSupplierByPage invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetSupplierByPage preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetSupplierByPage baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    GetSupplierByPage specialAssert(TestContext testContext){
        Map apiResult = testContext.getResponse().data
        assert apiResult.total > 20
        return this
    }
}
