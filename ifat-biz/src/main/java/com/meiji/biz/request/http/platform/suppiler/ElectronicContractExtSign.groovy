package com.meiji.biz.request.http.platform.suppiler

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class ElectronicContractExtSign extends PlatformPost {
    {
        super.api = "/ElectronicContract/extSign"
        super.params =  ["contractId"]
    }

    ElectronicContractExtSign invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    ElectronicContractExtSign preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    ElectronicContractExtSign baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
